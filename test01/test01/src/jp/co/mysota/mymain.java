//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;

public class mymain
{

	public String speechRecogResult;
	public RecogResult recogresult;
	public CRobotPose pose;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,288,32,False,4,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,96,32,96,32,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,160,32,160,32,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,224,32,224,32,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	for(int i=0;i<(int)3;i++)																							//@<BlockInfo>jp.vstone.block.for,3184,112,3408,112,False,5,コメント@</BlockInfo>
	{
																														//@<OutputChild>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	*/

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,0,240,4128,240,False,39,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"何か用ですか？",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,64,240,64,240,False,38,@</BlockInfo>
																														//@<EndOfBlock/>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,128,240,3904,240,False,37,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.score2,192,192,3808,192,False,34,音声認識を行い、認識候補との完全一致で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 "ながの" ,  "" , 
			},false);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)"ながの"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,256,192,256,192,False,33,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,-900,0,270,900,0,0,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"自分なんかほんと生意気なんですけど",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,320,192,320,192,False,32,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,384,192,384,192,False,31,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,-900,0,900,0,0,50,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"画家の",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,448,192,448,192,False,30,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,512,192,512,192,False,29,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,180,-530,900,0,0,50,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"ゴッホと",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,576,192,576,192,False,28,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,640,192,640,192,False,27,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,180,-480,-180,460,0,50,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"ピカソに",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,704,192,704,192,False,26,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,768,192,768,192,False,25,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,-610,250,610,-240,0,-110,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"捧げる曲を",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,832,192,832,192,False,24,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,896,192,896,192,False,23,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,-610,250,610,-240,0,50,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"作ってきましたので",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,960,192,960,192,False,22,@</BlockInfo>
																															//@<EndOfBlock/>
					{																										//@<BlockInfo>jp.vstone.block.thread,1024,192,1216,192,False,21,スレッド@</BlockInfo>
						Thread th = new Thread(new Runnable() {
							@Override
							public void run() {
								try{
									
									
																															//@<OutputChild>
									pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,1088,192,1088,192,False,7,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{0,-610,250,610,-240,0,50,-300}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,300);
									CRobotUtil.wait(300);																				//@<EndOfBlock/>
									pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,1152,192,1152,192,False,6,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{0,-610,250,610,-240,0,50,300}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,300);
									CRobotUtil.wait(300);																				//@<EndOfBlock/>
																																			//@</OutputChild>
					
									
								} catch(Exception e) {
									CRobotUtil.Err("jp.vstone.block.thread","例外が発生しました。");
									e.printStackTrace();
								}
							}
						});
						th.start();
					}
																															//@<EndOfBlock/>
					{																										//@<BlockInfo>jp.vstone.block.thread,1312,192,1440,192,False,20,スレッド@</BlockInfo>
						Thread th = new Thread(new Runnable() {
							@Override
							public void run() {
								try{
									
									
																															//@<OutputChild>
									GlobalVariable.sotawish.Say((String)"聞いてください",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,1376,192,1376,192,False,8,@</BlockInfo>
																																		//@<EndOfBlock/>
																																			//@</OutputChild>
					
									
								} catch(Exception e) {
									CRobotUtil.Err("jp.vstone.block.thread","例外が発生しました。");
									e.printStackTrace();
								}
							}
						});
						th.start();
					}
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,2720,192,2720,192,False,19,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{69,-1397,232,1454,-206,-36,50,61}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					CRobotUtil.wait((int)2000);																				//@<BlockInfo>jp.vstone.block.wait,2848,192,2848,192,False,18,コメント@</BlockInfo>	@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,2912,192,2912,192,False,17,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{63,489,-385,-367,457,1495,-124,-61}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,200);
					CRobotUtil.wait(200);																					//@<EndOfBlock/>
					for(int i=0;i<(int)5;i++)																				//@<BlockInfo>jp.vstone.block.for,2976,192,3296,192,False,16,コメント@</BlockInfo>
					{
																															//@<OutputChild>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,2976,192,2976,192,False,12,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{63,-770,-659,743,694,930,-147,65}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{0,-255,0,180,80,0,180,80,0}
										);
						GlobalVariable.motion.play(pose,150);
						CRobotUtil.wait(150);																				//@<EndOfBlock/>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,3104,192,3104,192,False,11,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{-20,-141,-673,145,722,773,-65,-12}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{0,-255,0,180,80,0,180,80,0}
										);
						GlobalVariable.motion.play(pose,150);
						CRobotUtil.wait(150);																				//@<EndOfBlock/>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,3168,192,3168,192,False,10,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{63,324,-455,-350,359,1497,-126,-62}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{0,-255,0,180,80,0,180,80,0}
										);
						GlobalVariable.motion.play(pose,150);
						CRobotUtil.wait(150);																				//@<EndOfBlock/>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,3232,192,3232,192,False,9,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{-19,-147,-671,150,719,773,-65,-12}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{0,-255,0,180,80,0,180,80,0}
										);
						GlobalVariable.motion.play(pose,150);
						CRobotUtil.wait(150);																				//@<EndOfBlock/>
																															//@</OutputChild>
					}																										//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,3360,192,3360,192,False,15,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{63,-1386,29,-167,668,1496,-68,-300}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,200);
					CRobotUtil.wait(200);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"面白いところ見てやってー",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,3424,192,3424,192,False,14,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,3744,192,3744,192,False,13,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
																														//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,3984,240,3984,240,False,36,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{-20,-907,18,898,71,-1,50,-7}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,1000);
		CRobotUtil.wait(1000);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ありがとうございましたー",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,4064,240,4064,240,False,35,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void nagano()																								//@<BlockInfo>jp.vstone.block.func,0,496,992,496,False,49,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,64,496,64,496,False,48,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{69,-1397,232,1454,-206,-36,50,61}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,1000);
		CRobotUtil.wait(1000);																							//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,128,496,128,496,False,47,コメント@</BlockInfo>	@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,192,496,192,496,False,46,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{63,489,-385,-367,457,1495,-124,-61}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,200);
		CRobotUtil.wait(200);																							//@<EndOfBlock/>
		for(int i=0;i<(int)5;i++)																						//@<BlockInfo>jp.vstone.block.for,256,496,576,496,False,45,コメント@</BlockInfo>
		{
																														//@<OutputChild>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,320,496,320,496,False,43,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{63,-770,-659,743,694,1330,-80,-60}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,150);
			CRobotUtil.wait(150);																						//@<EndOfBlock/>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,384,496,384,496,False,42,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{-20,-141,-673,145,722,1330,-80,-60}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,150);
			CRobotUtil.wait(150);																						//@<EndOfBlock/>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,448,496,448,496,False,41,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{63,324,-455,-350,359,1330,-80,-60}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,150);
			CRobotUtil.wait(150);																						//@<EndOfBlock/>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,512,496,512,496,False,40,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{-19,-147,-671,150,719,1330,-80,-60}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,250);
			CRobotUtil.wait(250);																						//@<EndOfBlock/>
																														//@</OutputChild>
		}																												//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,640,496,640,496,False,44,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{63,-1386,29,-167,668,1496,-68,-300}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,200);
		CRobotUtil.wait(200);																							//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
