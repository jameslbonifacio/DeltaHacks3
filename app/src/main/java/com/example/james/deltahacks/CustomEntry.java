package com.example.james.deltahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class CustomEntry extends AppCompatActivity {

    private SeekBar seekBarCalories, seekBarFat, seekBarProtein, seekBarCarbs, seekBarSugar, seekBarFiber, seekBarSodium;
    private TextView lblCalories, lblFat, lblProtein, lblCarbs, lblSugar, lblFiber, lblSodium;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_entry);

        seekBarCalories();
        seekBarFat();
        seekBarProtein();
        seekBarCarbs();
        seekBarSugar();
        seekBarFiber();
        seekBarSodium();

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(btnClickListener);
    }

    private View.OnClickListener btnClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {

        }
    };

    public void seekBarCalories(){

        seekBarCalories = (SeekBar) findViewById(R.id.seekBarCalories);
        lblCalories = (TextView) findViewById(R.id.lblCalories);

        seekBarCalories.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblCalories.setText("Calories: " + String.valueOf(seekBarCalories.getProgress()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblCalories.setText("Calories: " + String.valueOf(seekBarCalories.getProgress()));
                    }
                }
        );
    }

    public void seekBarFat(){

        seekBarFat = (SeekBar) findViewById(R.id.seekBarFat);
        lblFat = (TextView) findViewById(R.id.lblFat);


        seekBarFat.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){


                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblFat.setText("Fat: " + String.valueOf(seekBarFat.getProgress()) + "g");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblFat.setText("Fat: " + String.valueOf(seekBarFat.getProgress()) + "g");

                    }
                }
        );

    }

    public void seekBarProtein(){
        seekBarProtein = (SeekBar) findViewById(R.id.seekBarProtein);
        lblProtein = (TextView) findViewById(R.id.lblProtein);


        seekBarProtein.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){


                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblProtein.setText("Protein: " + String.valueOf(seekBarProtein.getProgress()) + "g");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblProtein.setText("Protein: " + String.valueOf(seekBarProtein.getProgress()) + "g");

                    }
                }
        );

    }

    public void seekBarCarbs(){

        seekBarCarbs = (SeekBar) findViewById(R.id.seekBarCarbs);
        lblCarbs = (TextView) findViewById(R.id.lblCarbs);


        seekBarCarbs.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){


                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblCarbs.setText("Carbohydrates: " + String.valueOf(seekBarCarbs.getProgress()) + "g");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblCarbs.setText("Carbohydrates: " + String.valueOf(seekBarCarbs.getProgress()) + "g");

                    }
                }
        );

    }

    public void seekBarSugar(){

        seekBarSugar = (SeekBar) findViewById(R.id.seekBarSugar);
        lblSugar = (TextView) findViewById(R.id.lblSugar);


        seekBarSugar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){


                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblSugar.setText("Sugar: " + String.valueOf(seekBarSugar.getProgress()) + "g");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblSugar.setText("Sugar: " + String.valueOf(seekBarSugar.getProgress()) + "g");

                    }
                }
        );

    }

    public void seekBarFiber(){

        seekBarFiber = (SeekBar) findViewById(R.id.seekBarFiber);
        lblFiber = (TextView) findViewById(R.id.lblFiber);


        seekBarFiber.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){


                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblFiber.setText("Fiber: " + String.valueOf(seekBarFiber.getProgress()) + "g");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblFiber.setText("Fiber: " + String.valueOf(seekBarFiber.getProgress()) + "g");

                    }
                }
        );

    }

    public void seekBarSodium(){

        seekBarSodium = (SeekBar) findViewById(R.id.seekBarSodium);
        lblSodium = (TextView) findViewById(R.id.lblSodium);


        seekBarSodium.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){


                    int progressValue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressValue = progress;
                        lblSodium.setText("Sodium: " + String.valueOf(seekBarSodium.getProgress()) + "g");

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        lblSodium.setText("Sodium: " + String.valueOf(seekBarSodium.getProgress()) + "g");

                    }
                }
        );

    }
}
