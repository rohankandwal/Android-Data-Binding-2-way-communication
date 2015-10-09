package com.itcse.databinding_2way;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itcse.databinding_2way.POJOClasses.SimplePOJO;
import com.itcse.databinding_2way.databinding.ActivityMainBinding;

/**
 * Launcher Activity displaying two EditTexts. Both EditTexts point to same class object. Since we
 * have used 2 way authentication, once we update the text in either of EditText, it will automatically
 * be reflected in another EditText.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // No need to add a setContentView(), we will use DataBinding to set the contentView
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // Binding SimplePOJO class with the DataBinding Adapter
        binding.setSimplePOJO(new SimplePOJO());
    }
}
