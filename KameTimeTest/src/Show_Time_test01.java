import java.text.SimpleDateFormat;
import java.util.Date;

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
	   	Date date = new Date();     //現時刻の取得
	   	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	   	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   	System.out.println(sdf1.format(date));
        String path_in = "images/kame_2592_1944.png";             //画像を取得
        String path_out = "images/"+sdf1.format(date)+".png";     //画像を出力時の時刻の名前で保存

        Mat mat_src = new Mat();

        mat_src = Highgui.imread(path_in);                         // 入力画像の読み込み
        Core.putText(mat_src, sdf2.format(date), new Point(2000, 1900), Core.FONT_HERSHEY_SIMPLEX, 1.6f, new Scalar(0, 0, 0), 3);

        Highgui.imwrite(path_out, mat_src);                         // 出力画像を保存
    }

}
