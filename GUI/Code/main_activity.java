{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 ArialMT;\f1\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sa0\partightenfactor0

\f0\fs29\fsmilli14667 \cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 package com.example.exp7;
\f1 \

\f0 \'a0
\f1 \

\f0 import android.graphics.Color;
\f1 \

\f0 import android.os.Bundle;
\f1 \

\f0 import android.view.View;
\f1 \

\f0 import android.widget.Button;
\f1 \

\f0 import android.widget.TextView;
\f1 \

\f0 \'a0
\f1 \

\f0 import androidx.appcompat.app.AppCompatActivity;
\f1 \

\f0 \'a0
\f1 \

\f0 public class MainActivity extends AppCompatActivity \{
\f1 \

\f0 \'a0\'a0\'a0\'a0int ch=1;
\f1 \

\f0 \'a0\'a0\'a0\'a0float font=30;
\f1 \

\f0 \'a0\'a0\'a0\'a0@Override
\f1 \

\f0 \'a0\'a0\'a0\'a0protected void onCreate(Bundle savedInstanceState) \{
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0super.onCreate(savedInstanceState);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0final TextView t=(TextView) findViewById(R.id.TextView);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Button b1=(Button) findViewById(R.id.button1);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b1.setOnClickListener(new View.OnClickListener() \{
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0@Override
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0public void onClick(View view) \{
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0t.setTextSize(font);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0font=font+5;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (font==50)
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0font=30;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\});
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0setContentView(R.layout.activity_main);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Button b2=(Button) findViewById(R.id.button2);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b2.setOnClickListener(new View.OnClickListener() \{
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0@Override
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0public void onClick(View view) \{
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0switch (ch)\{
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0case 1: t.setTextColor(Color.BLACK);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0break;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0case 2: t.setTextColor(Color.MAGENTA);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0break;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0case 3: t.setTextColor(Color.GRAY);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0break;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0case 4: t.setTextColor(Color.CYAN);
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ch++;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if(ch==5)
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ch=1;
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1 \

\f0 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\});
\f1 \

\f0 \'a0\'a0\'a0\'a0\}
\f1 \

\f0 \}
\f1 \
}