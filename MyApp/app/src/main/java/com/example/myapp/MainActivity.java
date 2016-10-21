package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private String str,str0,result;
    private double dou=0;//计算结果

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button  btn0=(Button)findViewById(R.id.button0);
        final TextView text=(TextView) findViewById(R.id.textView);
        final TextView text1=(TextView) findViewById(R.id.textView2);
        btn0.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn0.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn1.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn2.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn3=(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn3.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn4=(Button)  findViewById(R.id.button4);
        btn4.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn4.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn5=(Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn5.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn6=(Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn6.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn7=(Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn7.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn8=(Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn8.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn9=(Button)  findViewById(R.id.button9);
        btn9.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn9.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn10=(Button)findViewById(R.id.button10);//小数点
        btn10.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn10.getText().toString();
                text.setText(str+str0);
            }
        });
        final Button  btn11=(Button)findViewById(R.id.button11);//加
        btn11.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn11.getText().toString();
                text.setText(str+" "+str0+" ");
            }
        });
        final Button  btn12=(Button)findViewById(R.id.button12);//减
        btn12.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn12.getText().toString();
                text.setText(str+" "+str0+" ");
            }
        });
        final Button  btn13=(Button)findViewById(R.id.button13);//乘
        btn13.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn13.getText().toString();
                text.setText(str+" "+str0+" ");
            }
        });
        final Button  btn14=(Button)findViewById(R.id.button14);//除
        btn14.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str0=btn14.getText().toString();
                text.setText(str+" "+str0+" ");
            }
        });
        final Button  btn15=(Button)findViewById(R.id.button15);//delete清除文本框内的内容
        btn15.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                str=str.substring(0,str.length()-1);
                text.setText(str);
            }
        });
        final Button  btn16=(Button)findViewById(R.id.button16);//=得出结果
        btn16.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                 YunXing();
            }
        });
        final Button  btn17=(Button)findViewById(R.id.button17);//delete清除文本框内的内容
        btn17.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                text.setText("");
                text1.setText("");
            }
        });
        final Button  btn18=(Button)findViewById(R.id.button18);//delete清除文本框内的内容
        btn18.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
               ErJinZhi();
            }
        });
        final Button  btn19=(Button)findViewById(R.id.button19);//delete清除文本框内的内容
        btn19.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                SheLiuJinZhi();
            }
        });

    }
    private void YunXing()
    {
        final TextView text=(TextView) findViewById(R.id.textView);
        final TextView text1=(TextView) findViewById(R.id.textView2);
        result = text.getText().toString();//获得要运算的公式
        if (result == null || result == "") { //假如公式为空则不运算
            return;
        }
        if (!result.contains(" ")) {//判断公式有没有运算符，没有则不进行运算
            return;
        }
        if(result.contains(" +  + ")||result.contains(" -  - ")||result.contains(" *  * ")||result.contains(" /  / ")||result.contains(".."))
        {
            text1.setText("非数字符号连的出现");return;
        }
        int d=0;
        char[] N=result.toCharArray();
        for(int i=0;i<result.length();i++)
        {if(N[i]=='+') d++;}
        if(d<=1)

           getResult();
        else
            LeiJia();

    }
   private void getResult()//运算
    {
        final TextView text=(TextView) findViewById(R.id.textView);
        final TextView text1=(TextView) findViewById(R.id.textView2);
        result = text.getText().toString();//获得要运算的公式
        str = result.substring(0, result.indexOf(" "));//运算符前字段
        String op = result.substring(result.indexOf(" ") + 1, result.indexOf(" ") + 2);//运算符
        str0 = result.substring(result.indexOf(" ") + 3);//运算符后字段
        if (!str.equals("") && !str0.equals(""))//第一种情况：前后字段都不为空，即有两个数
        {
            double d1 = Double.parseDouble(str);//强行转换
            double d2 = Double.parseDouble(str0);
            if (op.equals("+"))
            {
                dou = d1 + d2;
            } else if (op.equals("-"))
            {
                dou = d1 - d2;
            } else if (op.equals("*"))
            {
                dou = d1 * d2;
            } else if (op.equals("/"))
            {
                if (d2 == 0)
                    dou = 0;
                else
                    dou = d1 / d2;
            }
            if (!str.contains(".") && !str0.contains(".") && !op.equals("/")) {//结果为int类型
                int i = (int) dou;
                text1.setText(i+"");
            } else {//结果为double类型
                text1.setText(dou+"");
            }
        }else if(!str.equals("") && str0.equals(""))//第二种情况：只有前字段和运算符
        {
            text1.setText(result);
        }else if(str.equals("") && !str0.equals(""))//第三种情况：只有运算符和后字段
        {
            double d3= Double.parseDouble(str0);
            if(op.equals("+"))
            {
                dou=0+d3;
            }else if(op.equals("-"))
            {
                dou=0-d3;
            }else if(op.equals("*"))
            {
                dou=0;
            }else if(op.equals("/"))
            {
                dou=0;
            }
            if(!str0.contains("."))
            {
                int i=(int)dou;
                text1.setText(i+"");
            }else
            {
                text1.setText(dou+"");
            }
        }
        else//最后情况：前后字符都没有，即没有运算的数字
        {
            text1.setText("");
        }
    }
    private void ErJinZhi()//二进制
    {
        final TextView text1=(TextView) findViewById(R.id.textView2);
         result=text1.getText().toString();
        if(!result.contains("."))
        {
            int  d=Integer.parseInt(result);
            result=Integer.toBinaryString(d);
            text1.setText(result);
        }
        else
        {
            String Z=result.substring(0,result.indexOf("."));
            String X=result.substring(result.indexOf("."));
            String str="";
            X="0"+X;
            int z=Integer.parseInt(Z);
            double x=Double.parseDouble(X);
            Z=Integer.toBinaryString(z);
            for(int i=0;i<15;i++)
            {
                x=x*2;
                if(x>1.0) {str=str+"1";x=x-1.0;}
                else if(x==1.0){str=str+"1";break;}
                else if(x>0.0){str=str+"0";}
                else if(x==0.0){break;}
                else break;
            }
            result=Z+"."+str;
            text1.setText(result);
        }
    }

    private void SheLiuJinZhi()
    {
        final TextView text1=(TextView) findViewById(R.id.textView2);
        result=text1.getText().toString();
        if(!result.contains("."))
        {
            int d=Integer.parseInt(result);
            result=Integer.toHexString(d);
            text1.setText(result);
        }
        else
        {
            String Z=result.substring(0,result.indexOf("."));
            String X=result.substring(result.indexOf("."));
            String str="",zz="",zx;
            X="0"+X;
            int z=Integer.parseInt(Z);
            double x=Double.parseDouble(X);
            Z=Integer.toHexString(z);
            for(int i=0;i<15;i++)
            {
                 x=x*16;
                if(x>=1.0) {
                    zz=Double.toString(x);
                    zx="0"+zz.substring(zz.indexOf("."));
                    zz=zz.substring(0,zz.indexOf("."));
                    if(zz=="10"||zz=="11"||zz=="12"||zz=="13"||zz=="14"||zz=="15")
                     switch (zz)
                     {
                         case "10": str=str+"a";
                         case "11": str=str+"b";
                         case "12": str=str+"c";
                         case "13": str=str+"d";
                         case "14": str=str+"e";
                         case "15": str=str+"f";
                     }
                    else str=str+zz;
                     x=Double.parseDouble(zx);
                }
                else if(x>0.0){str=str+"0";}
                else if(x==0.0){break;}
                else break;
            }
            result=Z+"."+str;
            text1.setText(result);
        }
    }
    private void LeiJia()
    {
        final TextView text=(TextView) findViewById(R.id.textView);
        final TextView text1=(TextView) findViewById(R.id.textView2);
        result=text.getText().toString();
        result=result+" ";
        int a,b,c,d,n;String str1,str2,str="";double n1,n2,r;
        while(result.contains("+"))
        {
            a=result.indexOf(" + ");
            str1=result.substring(0,a);
            b=result.indexOf(" ",a+3);
            str2=result.substring(a+3,b);
            if(!str1.contains(".")&&!str2.contains(".")) {c=Integer.parseInt(str1);d=Integer.parseInt(str2);n=c+d;str=Integer.toString(n);}
            else{ n2=Double.parseDouble(str2); n1=Double.parseDouble(str1);r=n2+n1;str=Double.toString(r);}
            result= result.replace(result.substring(0,b),str);
        }
        text1.setText(result);
    }
}

