package com.totalcross;
// import library
import totalcross.ui.MainWindow;
import totalcross.sys.Settings;
import totalcross.ui.ScrollContainer;
import totalcross.ui.image.Image;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.gfx.Color;
import totalcross.ui.Edit;
import totalcross.ui.Check;
import totalcross.ui.Button;


public class myfirstapp extends MainWindow {
    // declaring variable
    private ScrollContainer  sc;
    private Image imgBack, imgLogo;
    private ImageControl background, logo;
    private Label Title, Gender;
    private Edit FullName, Date;
    private Check subject1, subject2, subject3;
    private Button Finish,Clear;
    
 
    public myfirstapp() {
        setUIStyle(Settings.MATERIAL_UI);
       
    }
 
    @Override
    public void initUI() {
        
        try {
                // defining characteristics
            // ScrollContainer
            sc = new ScrollContainer(false,true);
            add(sc, LEFT, TOP, FILL, FILL); // including in the application
            
            // Image
            imgBack = new Image("images/imagem-template-01.png");
            background = new ImageControl(imgBack);
            background.scaleToFit = true;  // Maintains the proportion
            background.strechImage = true;  // allows you to resize
            

            imgLogo = new Image("images/logo-branca.png");
            logo=new ImageControl(imgLogo);
            logo.transparentBackground = true; // make transparent background
            logo.scaleToFit = true;  
            logo.strechImage = true;  
            logo.tempHwScale=0.6; // scale the image
            
            // Label
            Title =  new  Label("Registration Form");
            Title.transparentBackground=true; 
            Title.setForeColor(Color.WHITE); // changes the color of the object

            Gender =  new  Label("Gender");
            Gender.transparentBackground=true;
            Gender.setForeColor(Color.WHITE);
            
            //Edit
            FullName=  new  Edit(); 
            FullName.caption =  "Full Name"; // changes what is written in the capture state
            FullName.captionColor=Color.WHITE; // changes the object's color in the capture state
            FullName.transparentBackground =  true; 
            FullName.setForeColor(Color.WHITE);

            Date =  new  Edit();
            Date.caption =  "Birth Day";
            Date.captionColor=Color.WHITE;
            Date.setMode(Edit.DATE, true); // change capture mode to date
            Date.transparentBackground=true;
            Date.setForeColor(Color.WHITE);
            
            // Check
            subject1 = new Check("Male");
            subject1.transparentBackground=true;
            subject1.setForeColor(Color.WHITE); 
            subject1.effect = null; // turn off click effect

            subject2 = new Check("Female");
            subject2.transparentBackground=true;
            subject2.setForeColor(Color.WHITE);
            subject2.effect = null;

            subject3 = new Check("Other");
            subject3.transparentBackground=true;
            subject3.setForeColor(Color.WHITE);   
            subject3.effect = null;
            
            // Button
            Finish = new Button("Submit");
            Finish.setForeColor(Color.WHITE);
            Finish.borderColor=Color.WHITE; // changes the border color
            Finish.transparentBackground=true;
            
            Clear = new Button("Clear");
            Clear.setForeColor(Color.WHITE);
            Clear.borderColor=Color.WHITE;
            Clear.transparentBackground=true;
            
            // including in the container
            // Image
            sc.add(background, LEFT, TOP);
            sc.add(logo, CENTER , TOP-15);

            sc.add(Title, CENTER, TOP); // Label
            
            sc.add(FullName, CENTER, AFTER + 125 ); // Edit

            sc.add(Gender, LEFT+25, AFTER+25 ); // Label

            // Check
            sc.add(subject1, LEFT+15, AFTER-5 , PREFERRED, PREFERRED+25 );
            sc.add(subject2, LEFT+15, AFTER-5 , PREFERRED, PREFERRED+25 );
            sc.add(subject3, LEFT+15, AFTER-5 , PREFERRED, PREFERRED+25 );
            
            sc.add(Date,CENTER, AFTER);// Edit
            
            // Button
            sc.add(Finish, CENTER-60, AFTER+30,100, 50);
            sc.add(Clear, CENTER+60, SAME, 100,50);

             }
            catch (Throwable e) {
                e.printStackTrace();
            }

    }
}
