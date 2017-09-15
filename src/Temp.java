//import Lesson3.ArrayUtils;
//import ForumApplication.Post;
//
//import java.util.Arrays;
//
//public class Temp {
//    public static void main(String[] args) {
//
//        int[] array = ArrayUtils.generateArray();
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("Minimum is: " + ArrayUtils.min(array) + "\tMaximum is: " + ArrayUtils.max(array));
//        System.out.println("Average is: " + ArrayUtils.average(array));
//
//        System.out.println();
//
//        System.out.println(Arrays.toString(ArrayUtils.bubbleSort(array)));
//        System.out.println(Arrays.toString(ArrayUtils.bubbleSortReverse(array)));
//
//        System.out.println();
//
//        Post[] posts = {new Post(author, "title1", "text tetetetet", "2017-09-07 12:15:16"),
//                new Post(author, "title1", "text tetetetet", "2017-09-07 12:15:13"),
//                new Post(author, "title2", "text tetetetet", "2017-09-07 12:15:20"),
//                new Post(author, "title3", "text tetetetet", "2017-09-07 12:15:01"),
//                new Post(author, "title4", "text tetetetet", "2017-09-07 12:15:35"),
//                new Post(author, "title5", "text tetetetet", "2017-09-07 12:15:54"),
//                new Post(author, "title6", "text tetetetet", "2017-09-07 12:15:02"),
//                new Post(author, "title7", "text tetetetet", "2017-09-07 12:15:15")
//        };
//
////        Post[] posts = {new Post("title1", "text tetetetet"),
////                new Post("title1", "text tetetetet"),
////                new Post("title2", "text tetetetet"),
////                new Post("title3", "text tetetetet"),
////                new Post("title4", "text tetetetet"),
////                new Post("title5", "text tetetetet"),
////                new Post("title6", "text tetetetet"),
////                new Post("title7", "text tetetetet")
////        };
//
//        // Printing the initial IDs order
//        for (Post post : posts) {
//            System.out.println(post.getPostId());
//        }
//
//        System.out.println();
//
//        Post[] sortedById = Post.sortByPostId(posts);
//
//        // Printing the sorted IDs order
//        for (Post post : sortedById) {
//            System.out.println(post.getPostId());
//        }
//
//        System.out.println();
//
//
//        Post[] sortedByPostedAt = Post.sortByPostedAt(posts);
//
//        for (Post post : sortedByPostedAt) {
//            System.out.println(post.getPostedAt());
//        }
//    }
//}