package com.hunterdavis.easytonedialer;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class EasyToneDialer extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		OnClickListener oneButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_1, 100);
				tg.release();

			}
		};

		OnClickListener twoButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_2, 100);
				tg.release();

			}
		};

		OnClickListener threeButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_3, 100);
				tg.release();

			}
		};

		OnClickListener fourButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_4, 100);
				tg.release();

			}
		};

		OnClickListener fiveButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_5, 100);
				tg.release();

			}
		};

		OnClickListener sixButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_6, 100);
				tg.release();

			}
		};

		OnClickListener sevenButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_7, 100);
				tg.release();

			}
		};

		OnClickListener eightButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_8, 100);
				tg.release();

			}
		};

		OnClickListener nineButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_9, 100);
				tg.release();

			}
		};

		OnClickListener starButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_S, 100);
				tg.release();

			}
		};

		OnClickListener poundButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_P, 100);
				tg.release();

			}
		};

		OnClickListener zeroButtonListner = new OnClickListener() {
			public void onClick(View v) {
				ToneGenerator tg = new ToneGenerator(
						AudioManager.STREAM_SYSTEM, 100);
				tg.startTone(ToneGenerator.TONE_DTMF_0, 100);
				tg.release();

			}
		};

		// listener for frequency button
		OnClickListener frequencyListner = new OnClickListener() {
			public void onClick(View v) {
				EditText freqText = (EditText) findViewById(R.id.freq);
				String frequency = freqText.getText().toString();
				if (frequency.length() > 0) {
					float localFreqValue = Float.valueOf(frequency);
					playFrequency(v.getContext(), localFreqValue);
				}

			}
		};

		// listener for sequence button
		OnClickListener sequenceListner = new OnClickListener() {
			public void onClick(View v) {
				EditText freqText = (EditText) findViewById(R.id.dialnums);
				String dialnums = freqText.getText().toString();
				if (dialnums.length() > 0) {
					playSequence(v.getContext(), dialnums);
				}

			}
		};

		// find buttons
		Button oneButton = (Button) findViewById(R.id.onebutton);
		oneButton.setOnClickListener(oneButtonListner);
		Button twoButton = (Button) findViewById(R.id.twobutton);
		twoButton.setOnClickListener(twoButtonListner);
		Button threeButton = (Button) findViewById(R.id.threebutton);
		threeButton.setOnClickListener(threeButtonListner);

		// buttons 4-6
		Button fourButton = (Button) findViewById(R.id.fourbutton);
		fourButton.setOnClickListener(fourButtonListner);
		Button fiveButton = (Button) findViewById(R.id.fivebutton);
		fiveButton.setOnClickListener(fiveButtonListner);
		Button sixButton = (Button) findViewById(R.id.sixbutton);
		sixButton.setOnClickListener(sixButtonListner);

		// buttons 7-9
		Button sevenButton = (Button) findViewById(R.id.sevenbutton);
		sevenButton.setOnClickListener(sevenButtonListner);
		Button eightButton = (Button) findViewById(R.id.eightbutton);
		eightButton.setOnClickListener(eightButtonListner);
		Button nineButton = (Button) findViewById(R.id.ninebutton);
		nineButton.setOnClickListener(nineButtonListner);

		// buttons s p 0
		Button zeroButton = (Button) findViewById(R.id.zerobutton);
		zeroButton.setOnClickListener(zeroButtonListner);
		Button poundButton = (Button) findViewById(R.id.poundbutton);
		poundButton.setOnClickListener(eightButtonListner);
		Button starButton = (Button) findViewById(R.id.starbutton);
		starButton.setOnClickListener(nineButtonListner);

		// frequency button
		Button freqButton = (Button) findViewById(R.id.freqbutton);
		freqButton.setOnClickListener(frequencyListner);

		// sequence button
		Button seqButton = (Button) findViewById(R.id.dialbutton);
		seqButton.setOnClickListener(sequenceListner);

		// Look up the AdView as a resource and load a request.
		AdView adView = (AdView) this.findViewById(R.id.adView);
		adView.loadAd(new AdRequest());
	}

	public void playSequence(Context context, String sequence) {

		ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_SYSTEM, 100);

		for (int i = 0; i < sequence.length(); i++) {
			if (sequence.charAt(i) == '0') {
				tg.startTone(ToneGenerator.TONE_DTMF_0, 100);
			} else if (sequence.charAt(i) == '1') {
				tg.startTone(ToneGenerator.TONE_DTMF_1, 100);
			} else if (sequence.charAt(i) == '2') {
				tg.startTone(ToneGenerator.TONE_DTMF_2, 100);
			} else if (sequence.charAt(i) == '3') {
				tg.startTone(ToneGenerator.TONE_DTMF_3, 100);
			} else if (sequence.charAt(i) == '4') {
				tg.startTone(ToneGenerator.TONE_DTMF_4, 100);
			} else if (sequence.charAt(i) == '5') {
				tg.startTone(ToneGenerator.TONE_DTMF_5, 100);
			} else if (sequence.charAt(i) == '6') {
				tg.startTone(ToneGenerator.TONE_DTMF_6, 100);
			} else if (sequence.charAt(i) == '7') {
				tg.startTone(ToneGenerator.TONE_DTMF_7, 100);
			} else if (sequence.charAt(i) == '8') {
				tg.startTone(ToneGenerator.TONE_DTMF_8, 100);
			} else if (sequence.charAt(i) == '9') {
				tg.startTone(ToneGenerator.TONE_DTMF_9, 100);
			} else if (sequence.charAt(i) == '*') {
				tg.startTone(ToneGenerator.TONE_DTMF_S, 100);
			} else if (sequence.charAt(i) == '#') {
				tg.startTone(ToneGenerator.TONE_DTMF_P, 100);
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		tg.release();
	}

	public void playFrequency(Context context, Float frequency) {

		// final float frequency2 = 440;
		float increment = (float) (2 * Math.PI) * frequency / 44100; // angular
																		// increment
																		// for
																		// each
																		// sample
		float angle = 0;
		AndroidAudioDevice device = new AndroidAudioDevice();
		float samples[] = new float[1024];

		for (int j = 0; j < 30; j++) {
			for (int i = 0; i < samples.length; i++) {
				samples[i] = (float) Math.sin(angle);
				angle += increment;
			}

			device.writeSamples(samples);

		}
	}

}