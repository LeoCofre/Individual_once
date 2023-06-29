package cl.awakelab.individualonce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cl.awakelab.individualonce.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(v -> Toast.makeText(this, "Turn off flight mode", Toast.LENGTH_LONG).show());
        binding.button2.setOnClickListener(v -> Toast.makeText(this, "Updating profile", Toast.LENGTH_LONG).show());
        binding.button3.setOnClickListener(v -> Toast.makeText(this, "Picture save to gallery", Toast.LENGTH_LONG).show());
        binding.button4.setOnClickListener(v -> Toast.makeText(this, "unlocked level 5", Toast.LENGTH_LONG).show());
        binding.button5.setOnClickListener(v -> Toast.makeText(this, "Level 4 completed", Toast.LENGTH_LONG).show());
        binding.button6.setOnClickListener(v -> Toast.makeText(this, "Music paused", Toast.LENGTH_LONG).show());
    }



}