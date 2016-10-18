//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.camera.*;
import	java.time.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	 org.opencv.core.Core;
import	 org.opencv.core.Mat;
import	 org.opencv.core.Point;
import	 org.opencv.core.Scalar;
import	 org.opencv.imgproc.Imgproc;
import	 org.opencv.imgcodecs.Imgcodecs;

public class time_show
{

	public String time_string;
	public String date_string;
	public int getDateTimeElement;
	public LocalDateTime localDateTime;
	public time_show()																									//@<BlockInfo>jp.vstone.block.func.constructor,16,16,336,16,False,5,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String time_string*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String date_string*/;																							//@<BlockInfo>jp.vstone.block.variable,144,16,144,16,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*int getDateTimeElement*/;																						//@<BlockInfo>jp.vstone.block.variable,208,16,208,16,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*LocalDateTime localDateTime*/;																				//@<BlockInfo>jp.vstone.block.variable,272,16,272,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,0,256,1008,256,False,16,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		{																												//@<BlockInfo>jp.vstone.block.time.getdatetimeelement,64,256,64,256,False,15,dateTimeに記録された日時情報から、年・月・日・時・分・秒のうち一つをtypeで指定し、変数int getDateTimeElementに代入する@</BlockInfo>
			LocalDateTime d = (LocalDateTime)localDateTime;
			getDateTimeElement = d.getHour();
		}																												//@<EndOfBlock/>
		if(getDateTimeElement<=11)																						//@<BlockInfo>jp.vstone.block.if,128,160,448,160,False,14,コメント@</BlockInfo>
		{
																														//@<OutputChild>
			GlobalVariable.sotawish.Say((String)"おはよう",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,256,160,256,160,False,6,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
		else if(getDateTimeElement<=16)
		{
																														//@<OutputChild>
			if(getDateTimeElement>11)																					//@<BlockInfo>jp.vstone.block.if,192,208,384,208,False,9,コメント@</BlockInfo>
			{
																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"こんにちは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,320,208,320,208,False,7,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
			else
			{
																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"こんばんは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,256,304,256,304,False,8,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
		else
		{
																														//@<OutputChild>
			GlobalVariable.sotawish.Say((String)"こんばんは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,320,368,320,368,False,10,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"突然だけど、写真撮るね。5、4、3、2、1、",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,512,256,512,256,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
		take_picture();																									//@<BlockInfo>jp.vstone.block.callfunc.base,576,256,576,256,False,12,@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"撮影終わったよ。ありがとう。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,944,256,944,256,False,11,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void take_picture()																							//@<BlockInfo>jp.vstone.block.func,0,528,304,528,False,21,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		localDateTime = LocalDateTime.now();																			//@<BlockInfo>jp.vstone.block.time.getlocaldatetime,64,464,64,464,False,20,ローカル時間をロボット内のカレンダーより取得し、変数LocalDateTime lodalDateTimeに代入。取得した情報から日時などを個別に切り出す場合は「日時の切り出しブロック」を使う@</BlockInfo>
																														//@<EndOfBlock/>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.time.getdate,96,560,96,560,False,19,ロボット内のカレンダーより現在年月日を文字列で取得し、変数String date_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
		time_string = CRobotUtil.getTimeString();																		//@<BlockInfo>jp.vstone.block.time.gettime,160,560,160,560,False,18,ロボット内のカレンダーより現在時刻を文字列で取得し、変数String time_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
		{																												//@<BlockInfo>jp.vstone.block.facedetect.stillpicture,224,560,224,560,False,17,still@</BlockInfo>
			String filepath = "/var/sota/photo/";
			filepath += (String)"picture";
			boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
			if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
			GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
			GlobalVariable.robocam.StillPicture(filepath);

			CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
			if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
		}																												//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	date_string = CRobotUtil.getDateString();																			//@<BlockInfo>jp.vstone.block.time.getdate,816,48,816,48,False,24,ロボット内のカレンダーより現在年月日を文字列で取得し、変数String date_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
	time_string = CRobotUtil.getTimeString();																			//@<BlockInfo>jp.vstone.block.time.gettime,880,48,880,48,False,23,ロボット内のカレンダーより現在時刻を文字列で取得し、変数String time_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
	{																													//@<BlockInfo>jp.vstone.block.facedetect.stillpicture,944,48,944,48,False,22,still@</BlockInfo>
		String filepath = "/var/sota/photo/";
		filepath += (String)"picture";
		boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
		if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
		GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
		GlobalVariable.robocam.StillPicture(filepath);

		CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
		if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
	}																													//@<EndOfBlock/>

	*/

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,0,672,272,672,False,26,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.freeproc,112,672,112,672,False,25,@</BlockInfo>
		time_string = CRobotUtil.getTimeString();


		String filepath = "/var/sota/photo/";
		filepath += (String)"picture02";
		boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
		if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
		GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
		GlobalVariable.robocam.StillPicture(filepath);

		CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
		if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();

		String path_in = "/var/sota/photo/picture02.jpg";
		String path_out = "/var/sota/photo/after_picture02.jpg";

		Mat mat_src = new Mat();

		mat_src = Imgcodecs.imread(path_in);
		Imgproc.putText(mat_src, date_string+" "+time_string, new Point(2000, 1900), Core.FONT_HERSHEY_SIMPLEX, 1.6f, new Scalar(0, 0, 0), 3);

		Imgcodecs.imwrite(path_out, mat_src);
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
