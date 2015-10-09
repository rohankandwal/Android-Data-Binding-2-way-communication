package com.itcse.databinding_2way.Utilities;

import android.databinding.BindingAdapter;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.itcse.databinding_2way.R;

/**
 * Class used to update SimpleInfo's name object from the layout .i.e it update "name" variable
 * based on the text a user enters in either of the text field.
 */
public class Utility {

    // Function where we set the value and add the TextWatcher to the EditText
    // This method is called whenever the object on which binding is done changes

    @BindingAdapter({"app:binding"})
    public static void bindEditText(final EditText view, final BindableString bindableString) {
        // We use tag to ensure that we aren't adding multiple TextWatcher for same EditText. This ensures that
        // EditText has only one TextWatcher
        if (view.getTag(R.id.dataBinding) == null) {
            view.setTag(R.id.dataBinding, true);
            view.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    bindableString.set(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }

        // Checking if the value has really changed. This prevents problems with the position of cursor
        // in the EditText
        String newValue = bindableString.get();
        if (!view.getText().toString().equals(newValue)) {
            view.setText(newValue);
        }

    }

}
