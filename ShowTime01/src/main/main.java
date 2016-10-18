package main;
//@<Replace/>	2
//@<Replace/>	1

//本ソースは、VstoneMagicから自動生成されました。
//本ソースの内容を書き換えると、正しくプログラムが実行されなくなる可能性があります。

import jp.co.mysota.time_show;
import jp.vstone.RobotLib.*;
import jp.vstone.sotatalk.SpeechRecog.*;
import jp.vstone.camera.*;
import jp.vstone.sotatalk.*;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.imgcodecs.Imgcodecs;


public class main
{
	public static void main(String[] args)
	{
		if(GlobalVariable.mem.Connect())
		{
			GlobalVariable.motion.InitRobot_Sota();
			if(GlobalVariable.InitServoOn)
			{
				GlobalVariable.motion.ServoOn();
				CRobotPose pose = new CRobotPose();
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{0,-900,0,900,0,0,0,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1500);
				CRobotUtil.wait(1500);
			}

			jp.co.mysota.time_show time_show = new jp.co.mysota.time_show();
			try
			{
				time_show.method();
			} catch(Exception e)
			{
				System.out.println("例外が発生しました:");
				e.printStackTrace();
			}
			System.exit(0);
		}
	}

	public static class GlobalVariable
	{
		public static CRobotMem mem = new CRobotMem();
		public static CSotaMotion motion = new CSotaMotion(mem);
		public static boolean InitServoOn = true;
		public static boolean TRUE = true;
		public static SpeechRecog recog = new SpeechRecog(motion);
		public static MotionAsSotaWish sotawish = new MotionAsSotaWish(motion);
		public static CRoboCamera robocam = new CRoboCamera("/dev/video0",motion);
	}


}

