package Lesson3;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Car car = new Car(1002, 140, "Ford");
        car.setWeight(-12);
        System.out.println(car.getWeight());


        // Homework

        int[] array = ArrayUtils.generateArray();

        System.out.println(Arrays.toString(array));

        System.out.println("Minimum is: " + ArrayUtils.min(array) + "\tMaximum is: " + ArrayUtils.max(array));
        System.out.println("Average is: " + ArrayUtils.average(array));

        System.out.println();

        System.out.println(Arrays.toString(ArrayUtils.bubbleSort(array)));
        System.out.println(Arrays.toString(ArrayUtils.bubbleSortReverse(array)));

        System.out.println();

        Post[] posts = {new Post("title1", "text tetetetet", "2017-09-07 12:15:16"),
                new Post("title1", "text tetetetet", "2017-09-07 12:15:13"),
                new Post("title2", "text tetetetet", "2017-09-07 12:15:20"),
                new Post("title3", "text tetetetet", "2017-09-07 12:15:01"),
                new Post("title4", "text tetetetet", "2017-09-07 12:15:35")
        };

//        Post[] posts = {new Post("title1", "text tetetetet"),
//                new Post("title1", "text tetetetet"),
//                new Post("title2", "text tetetetet"),
//                new Post("title3", "text tetetetet"),
//                new Post("title4", "text tetetetet"),
//                new Post("title5", "text tetetetet"),
//                new Post("title6", "text tetetetet"),
//                new Post("title7", "text tetetetet")
//        };
        // Printing the initial IDs order
        for (Post post : posts) {
            System.out.println(post.getPostId());
        }

        System.out.println();

        Post[] sortedById = Post.sortByPostId(posts);

        // Printing the sorted IDs order
        for (Post post : sortedById) {
            System.out.println(post.getPostId());
        }

        System.out.println();


        Post[] sortedByPostedAt = Post.sortByPostedAt(posts);

        for (Post post : sortedByPostedAt) {
            System.out.println(post.getPostedAt());
        }
    }
}
