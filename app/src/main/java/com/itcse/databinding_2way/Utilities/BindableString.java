package com.itcse.databinding_2way.Utilities;

import android.databinding.BaseObservable;
import android.support.annotation.NonNull;

import java.util.Objects;

/**
 * Class extending BaseObservable. This class is used for custom data binding. It helps us to bind
 * the string with EditText.
 */
public class BindableString extends BaseObservable {

    private String value;

    // Function to get the value
    public String get() {
        return value != null ? value : "";
    }

    // Function to set the value
    public void set(@NonNull String value) {
        if (!Objects.equals(this.value, value)) {
            this.value = value;
            notifyChange();
        }
    }

    // Function to check if value is empty
    public boolean isEmpty() {
        return value == null || value.isEmpty();
    }

}
