package com.example.cheatsheet;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    public int labelIndex = 0;
    char [] label = {'-','-','-'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button A = (Button)this.findViewById(R.id.A);
        final Button B = (Button)this.findViewById(R.id.B);
        final Button C = (Button)this.findViewById(R.id.C);
        final Button D = (Button)this.findViewById(R.id.D);
        final Button E = (Button)this.findViewById(R.id.E);
        final Button F = (Button)this.findViewById(R.id.F);
        final Button G = (Button)this.findViewById(R.id.G);
        final Button H = (Button)this.findViewById(R.id.H);
        final Button J = (Button)this.findViewById(R.id.J);
        final Button K = (Button)this.findViewById(R.id.K);
        final Button L = (Button)this.findViewById(R.id.L);
        final Button M = (Button)this.findViewById(R.id.M);
        final Button N = (Button)this.findViewById(R.id.N);
        final Button O = (Button)this.findViewById(R.id.O);
        final Button P = (Button)this.findViewById(R.id.P);
        final Button Q = (Button)this.findViewById(R.id.Q);
        final Button Rt = (Button)this.findViewById(R.id.Rt);
        final Button S = (Button)this.findViewById(R.id.S);
        final Button T = (Button)this.findViewById(R.id.T);
        final Button U = (Button)this.findViewById(R.id.U);
        final Button V = (Button)this.findViewById(R.id.V);
        final Button W = (Button)this.findViewById(R.id.W);
        final Button X = (Button)this.findViewById(R.id.X);
        final Button One = (Button)this.findViewById(R.id.One);
        TextView Label1 = (TextView)findViewById(R.id.Label1);
        TextView Label2 = (TextView)findViewById(R.id.Label2);
        TextView Label3 = (TextView)findViewById(R.id.Label3);

        displayStuff();

        A.setOnClickListener((v) -> {figureItOut('A'); displayStuff();});
        B.setOnClickListener((v) -> {figureItOut('B'); displayStuff();});
        C.setOnClickListener((v) -> {figureItOut('C'); displayStuff();});
        D.setOnClickListener((v) -> {figureItOut('D'); displayStuff();});
        E.setOnClickListener((v) -> {figureItOut('E'); displayStuff();});
        F.setOnClickListener((v) -> {figureItOut('F'); displayStuff();});
        G.setOnClickListener((v) -> {figureItOut('G'); displayStuff();});
        H.setOnClickListener((v) -> {figureItOut('H'); displayStuff();});
        J.setOnClickListener((v) -> {figureItOut('J'); displayStuff();});
        K.setOnClickListener((v) -> {figureItOut('K'); displayStuff();});
        L.setOnClickListener((v) -> {figureItOut('L'); displayStuff();});
        M.setOnClickListener((v) -> {figureItOut('M'); displayStuff();});
        N.setOnClickListener((v) -> {figureItOut('N'); displayStuff();});
        O.setOnClickListener((v) -> {figureItOut('O'); displayStuff();});
        P.setOnClickListener((v) -> {figureItOut('P'); displayStuff();});
        Q.setOnClickListener((v) -> {figureItOut('Q'); displayStuff();});
        Rt.setOnClickListener((v) -> {figureItOut('R'); displayStuff();});
        S.setOnClickListener((v) -> {figureItOut('S'); displayStuff();});
        T.setOnClickListener((v) -> {figureItOut('T'); displayStuff();});
        U.setOnClickListener((v) -> {figureItOut('U'); displayStuff();});
        V.setOnClickListener((v) -> {figureItOut('V'); displayStuff();});
        W.setOnClickListener((v) -> {figureItOut('W'); displayStuff();});
        X.setOnClickListener((v) -> {figureItOut('X'); displayStuff();});
        One.setOnClickListener((v) -> {figureItOut('1'); displayStuff();});

    }
    void figureItOut(char newLetter){
        label[labelIndex] = newLetter;
        labelIndex++;
    }

    void displayStuff(){
        TextView Label1 = (TextView)findViewById(R.id.Label1);
        TextView Label2 = (TextView)findViewById(R.id.Label2);
        TextView Label3 = (TextView)findViewById(R.id.Label3);
        TextView bayNumber = (TextView)findViewById(R.id.bayNumber);
        TextView stageTo = (TextView)findViewById(R.id.stageTo);

        Label1.setText(String.valueOf(label[0]));
        Label2.setText(String.valueOf(label[1]));
        Label3.setText(String.valueOf(label[2]));

        switch(String.copyValueOf(label)){
            case "DO-": bayNumber.setText("33"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "CWE": bayNumber.setText("38"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DDO": bayNumber.setText("31"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "CSU": bayNumber.setText("13"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "USF": bayNumber.setText("30"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DWC": bayNumber.setText("WILLCALL"); stageTo.setText("WLCALL"); clearLabel(); break;
            case "RS-": bayNumber.setText("18"); stageTo.setText("BAY RS"); clearLabel(); break;
            case "CA-": bayNumber.setText("18"); stageTo.setText("BAY RS"); clearLabel(); break;
            case "EA-": bayNumber.setText("18"); stageTo.setText("BAY RS"); clearLabel(); break;
            case "ED-": bayNumber.setText("18"); stageTo.setText("BAY RS"); clearLabel(); break;
            case "DFL": bayNumber.setText("25"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DNE": bayNumber.setText("33"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DNI": bayNumber.setText("33"); stageTo.setText("BAY ltl"); clearLabel(); break;
            case "HO-": bayNumber.setText("19"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "SN-": bayNumber.setText("19"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "MG-": bayNumber.setText("19"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "PO-": bayNumber.setText("27"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "SC-": bayNumber.setText("27"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DER": bayNumber.setText("27"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DC1": bayNumber.setText("WILLCALL"); stageTo.setText("FED EX"); clearLabel(); break;
            case "FX-": bayNumber.setText("11"); stageTo.setText("FED EX"); clearLabel(); break;
            case "WST": bayNumber.setText("CONTICO"); stageTo.setText("WLCALL"); clearLabel(); break;
            case "DC-": bayNumber.setText("21"); stageTo.setText("BAY DC"); break;
            case "DQ-": bayNumber.setText("21"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "DSC": bayNumber.setText("28"); stageTo.setText("BAY SC"); clearLabel(); break;
            case "DPO": bayNumber.setText("28"); stageTo.setText("BAY PO"); clearLabel(); break;
            case "WL-": bayNumber.setText("26"); stageTo.setText("WLCALL"); clearLabel(); break;
            case "NO-": bayNumber.setText("21"); stageTo.setText("WLCALL"); clearLabel(); break;
            case "SJ-": bayNumber.setText("28"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "SM-": bayNumber.setText("28"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "NC-": bayNumber.setText("28"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "JK-": bayNumber.setText("28"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "MT-": bayNumber.setText("28"); stageTo.setText("BAY LTL"); clearLabel(); break;
            case "CND": bayNumber.setText("13"); stageTo.setText("CND"); clearLabel(); break;
            case "TX-": bayNumber.setText("18"); stageTo.setText("BAY TX"); clearLabel(); break;
            case "OK-": bayNumber.setText("36"); stageTo.setText("BAY OK"); clearLabel(); break;
            case "BL-": bayNumber.setText("15"); stageTo.setText("BAY BL"); clearLabel(); break;
            case "RM-": bayNumber.setText("38"); stageTo.setText("BAY RM"); clearLabel(); break;
            case "LV-": bayNumber.setText("27"); stageTo.setText("BAY LV"); clearLabel(); break;
            case "OH-": bayNumber.setText("34"); stageTo.setText("WLCALL"); clearLabel(); break;
            case "HTT": bayNumber.setText("33"); stageTo.setText("WLCALL"); clearLabel(); break;
            case "F--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "J--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "N--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "B--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "K--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "C--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "M--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            case "H--": if(labelIndex == 2){bayNumber.setText("34"); stageTo.setText("LNTR"); clearLabel(); break;}
            default: if(labelIndex == 3){bayNumber.setText(""); stageTo.setText(""); clearLabel(); break;};
        }
    }
    void clearLabel(){
        label[0] = '-';
        label[1] = '-';
        label[2] = '-';
        labelIndex = 0;
    }
}

