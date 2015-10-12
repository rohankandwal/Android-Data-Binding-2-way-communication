# Android-Data-Binding-2-way-communication
This is an example of Android's new Data Binding Library showing how to have a two way communiction. Normally, Data BInding only works from the Object to layout and not Vice-Versa. Eg- If two EditTexts are bind to the same class object, updating object's value from one EditText should automatically show updated value in second EditText. But this doesn't happens, the values in EditText are only updated when using a "set" method. Further changes to the class's object are not reflected in the layout. However, if we use two way binding, then changes made in one EditText will automatically be updated in second EditText, since they are both using same object.

![Alt text](https://github.com/rohankandwal/Android-Data-Binding-2-way-communication/blob/master/screen%20shot.png?raw=true "When one EditText is modified, changes are reflected in another automatically")

See an example on Android Marshmallow 6.0 Data Binding with RecycleView @ https://github.com/rohankandwal/Marshmallow-Databinding-w-RecyclerView

Login form w/ validation through data binding
https://github.com/rohankandwal/LoginFormW-DataBinding
