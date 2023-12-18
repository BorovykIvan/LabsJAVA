import java.util.*;
public class VideoBlog {
    String blogger;
    List<Video> videos;

    public VideoBlog(String blogger) {
        this.blogger = blogger;
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    // Завдання 1: Знайти загальну сумарну кількість переглядів усіх відео разом.
    public int getTotalViews() {
        int totalViews = 0;

        Iterator<Video> videoIterator = videos.iterator();
        while (videoIterator.hasNext()) {
            Video video = videoIterator.next();
            totalViews += video.views;
        }

        return totalViews;
    }

    // Завдання 2: Визначити, чи є коментар, що набрав лайків більше, ніж відео,
    // до якого він дописаний.
    public boolean hasCommentWithMoreLikes() {
        for (Video video : videos) {
            for (Comment comment : video.comments) {
                if (comment.likes > video.likes) {
                    return true;
                }
            }
        }

        return false;
    }

    // Завдання 3: Визначити відео, що набрало найбільшу кількість дізлайків.
    public List<Video> getVideosWithMostDislikes() {
        List<Video> videosWithMostDislikes = new ArrayList<>();
        int maxDislikes = Integer.MIN_VALUE;

        Iterator videoIterator = videos.iterator();
        while (videoIterator.hasNext()) {
            Video video = (Video) videoIterator.next();

            if (video.dislikes > maxDislikes) {
                maxDislikes = video.dislikes;
                videosWithMostDislikes.clear();
                videosWithMostDislikes.add(video);
            } else if (video.dislikes == maxDislikes) {
                videosWithMostDislikes.add(video);
            }
        }

        return videosWithMostDislikes;
    }
}
