import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class test01 {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        String path_in = "C:/Users/tsuke/Documents/GitHub/SOTA_robot_programming/ImageProcessingTest/images/Lenna.jpg";
        String path_out = "C:/Users/tsuke/Documents/GitHub/SOTA_robot_programming/ImageProcessingTest/images/Lenna_gray.jpg";

        Mat mat_src = new Mat();
        Mat mat_dst = new Mat();

        mat_src = Imgcodecs.imread(path_in);
        Imgproc.cvtColor(mat_src, mat_dst, Imgproc.COLOR_BGR2GRAY);
        Imgcodecs.imwrite(path_out, mat_dst);
    }
}