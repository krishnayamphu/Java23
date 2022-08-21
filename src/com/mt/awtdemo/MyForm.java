package com.mt.awtdemo;

import java.awt.*;

public class MyForm extends Frame {
    private Label lblname, lblta, lblcourse,lblgender;
    private TextField txtname;
    private TextArea ta;
    private Checkbox cbbasic,cbweb, cbmale,cbfemale;
    private CheckboxGroup ckb=new CheckboxGroup();
    public MyForm(){
        lblname=new Label("Name");
        txtname=new TextField(20);

        lblta=new Label("Remarks");
        ta=new TextArea(5,10);

        lblcourse=new Label("Course");
        cbbasic=new Checkbox("Basic", true);
        cbweb=new Checkbox("Web");

        lblgender=new Label("Gender");

        cbmale=new Checkbox("Male",ckb, true);
        cbfemale=new Checkbox("Female",ckb, false);





        add(lblname);
        add(txtname);

        add(lblta);
        add(ta);

        add(lblcourse);
        add(cbbasic);
        add(cbweb);

        add(lblgender);
        add(cbmale);
        add(cbfemale);

        setLayout(new FlowLayout());
        setSize(300,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }
}
