import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;

public class Show_Time_test01 {
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
    	//int i = 1;
	   	System.out.println("start");
        String path_in = "kame_2592_1944.png";
        String path_out = "show_time.png";

        Mat mat_src = new Mat();
        Mat mat_dst = new Mat();

        mat_src = Highgui.imread(path_in);                         // 入力画像の読み込み
        Core.putText(mat_src, "2016/10/14  18:49:30", new Point(300, 800), Core.FONT_HERSHEY_SIMPLEX, 1.6f, new Scalar(20, 0, 200), 4);

        //Imgproc.cvtColor(mat_src, mat_dst, Imgproc.COLOR_BGR2GRAY); // カラー画像をグレー画像に変換
        Highgui.imwrite(path_out, mat_dst);                         // 出力画像を保存

        //
    }

}
