<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    tools:context="ru.samsung.itschool.book.myapplication.MainActivity">
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Фамилия" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Имя" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Отчество" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Год" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Город" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Школа" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Опыт программирования" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="24dp"
            android:text="Знание языков программирования" />
    </LinearLayout>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <EditText
            android:layout_width="60dp"
            android:layout_height="24dp" />
        <EditText
            android:layout_width="60dp"
            android:layout_height="24dp" />
        <EditText
            android:layout_width="60dp"
            android:layout_height="24dp" />
        <EditText
            android:layout_width="60dp"
            android:layout_height="24dp" />
        <EditText
            android:layout_width="60dp"
            android:layout_height="24dp" />
        <RadioGroup android:layout_height="wrap_content"
            android:layout_width="wrap_content">
            <RadioButton android:layout_height="24dp"
                android:layout_width="wrap_content"/>
            <RadioButton android:layout_height="24dp"
                android:layout_width="wrap_content"/>
        </RadioGroup>
        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="24dp" />
    </LinearLayout>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <CalendarView
            android:id="@+id/calendarView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1" />
    </LinearLayout>
</LinearLayout>
