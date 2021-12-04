//Запишите XML документ описывающий конкретного студента - например вас. Корневой элемент student, дочерние элементы: name,age,school. Содержимое документа скопируйте в поле ниже.
<?xml version="1.0" encoding="utf-8"?>
<student>
    <name> Mitya </name>
    <age> 17 </age>
    <school> 1158 </school>
</student>


//XML файл activity_main.xml содержит ошибки. Исправьте их и получившийся текст скопируйте в окно ниже.
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="RESULT:" />

    <TextView
        android:id="@+id/result"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="" />

    <!-- calculate button -->
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:onClick="clickFind"
        android:text="Start"/>
</LinearLayout>
