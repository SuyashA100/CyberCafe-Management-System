package com.cybercafe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.EventListener;

import static java.awt.image.ImageObserver.ERROR;

public class Main implements ActionListener, EventListener {




    String adminpass = "@dmin123";

    private static String mainusername,mainpass;
    public static JFrame frame = new JFrame("CyberCafe Management System");
    JLabel title = new JLabel("CyberCafe Management System");
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    static MenuBar mbar = new MenuBar();
    Menu loginmenu = new Menu("Login");
    public MenuItem login = new MenuItem("Login");
    // Declaring Section

    JLabel signinTitle = new JLabel("Sign In Page");
    JLabel nameLabel = new JLabel("Enter Your Name ");
    JTextField name = new JTextField();
    JLabel cynameLabel = new JLabel("Enter Your Cybercafe's Name");
    JTextField cyName = new JTextField();
    JLabel pcnoLabel = new JLabel("Enter The Number of Pcs you have");
    JTextField pcno = new JTextField();
    JLabel monoLabel = new JLabel("Enter Your Mobile Number");
    JTextField mono = new JTextField();
    JLabel stateLabel = new JLabel("Enter Your State's Name");
    JTextField state = new JTextField();
    JLabel cityLabel = new JLabel("Enter Your City's Name");
    JTextField city = new JTextField();
    JLabel passLabel = new JLabel("Enter Your Password");
    JTextField pass = new JTextField();
    Button signinSubmit = new Button("Sign up");
    Menu signinmenu = new Menu("Sign in");
    MenuItem signin = new MenuItem("Sign in");

    Button loginSubmit = new Button("Login");

    JLabel loginTitle = new JLabel("Login Page");

    JLabel usernameLabel = new JLabel("Enter Your Username");
    JTextField username = new JTextField();

    JTextField passl=new JTextField();







    // Sign in Page
    public void signin(JFrame frame, MenuBar mbar){
        login.setFont(new Font("SansSerif",Font.PLAIN,15));
        loginmenu.setFont(new Font("SansSerif",Font.PLAIN,15));
        loginmenu.add(login);
        mbar.add(loginmenu);
        frame.setMenuBar(mbar);

        // Setting The Fonts
        title.setFont(new Font("SansSerif",Font.BOLD,35));
        signinTitle.setFont(new Font("SansSerif",Font.BOLD,30));
        nameLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        cynameLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        pcnoLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        monoLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        stateLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        cityLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        passLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        name.setFont(new Font("SansSerif",Font.PLAIN,20));
        cyName.setFont(new Font("SansSerif",Font.PLAIN,20));
        pcno.setFont(new Font("SansSerif",Font.PLAIN,20));
        mono.setFont(new Font("SansSerif",Font.PLAIN,20));
        state.setFont(new Font("SansSerif",Font.PLAIN,20));
        city.setFont(new Font("SansSerif",Font.PLAIN,20));
        pass.setFont(new Font("SansSerif",Font.PLAIN,20));
        signinSubmit.setFont(new Font("SansSerif",Font.PLAIN,20));
        signinSubmit.setBackground(Color.black);
        signinSubmit.setForeground(Color.white);
        frame.getContentPane().setBackground(new Color(210 ,237 ,247));


        //Setting The Position
        title.setBounds((int)(dimension.getWidth()/2-title.getWidth()/2-260),20,700,100);
        signinTitle.setBounds((int)(dimension.getWidth()/2-signinTitle.getWidth()/2-100),80,700,100);
        name.setBounds(((int)(dimension.getWidth()/2)+70),200,200,30);
        nameLabel.setBounds(((int)(dimension.getWidth()/2)-(nameLabel.getWidth()+name.getWidth()+55)),200,200,25);
        cyName.setBounds(((int)(dimension.getWidth()/2+70)),240,200,30);
        cynameLabel.setBounds(((int)(dimension.getWidth()/2)-(cynameLabel.getWidth()+cyName.getWidth()+55)),240,300,25);
        pcno.setBounds(((int)(dimension.getWidth()/2+70)),280,200,30);
        pcnoLabel.setBounds(((int)(dimension.getWidth()/2)-(pcnoLabel.getWidth()+pcno.getWidth()+55)),280,350,25);
        mono.setBounds(((int)(dimension.getWidth()/2+70)),320,200,30);
        monoLabel.setBounds(((int)(dimension.getWidth()/2)-(monoLabel.getWidth()+mono.getWidth()+55)),320,300,25);
        state.setBounds(((int)(dimension.getWidth()/2+70)),360,200,30);
        stateLabel.setBounds(((int)(dimension.getWidth()/2)-(stateLabel.getWidth()+state.getWidth()+55)),360,300,25);
        city.setBounds(((int)(dimension.getWidth()/2+70)),400,200,30);
        cityLabel.setBounds(((int)(dimension.getWidth()/2)-(cityLabel.getWidth()+city.getWidth()+55)),400,300,25);
        pass.setBounds(((int)(dimension.getWidth()/2+70)),440,200,30);
        passLabel.setBounds(((int)(dimension.getWidth()/2)-(passLabel.getWidth()+pass.getWidth()+55)),440,300,25);
        signinSubmit.setBounds(((int)(dimension.getWidth()/2)-(signinSubmit.getWidth()/2)-50),520,120,40);




        signinSubmit.addActionListener(this);
        login.addActionListener(this);

        //Initiallizing to the Frame
        frame.add(title);
        frame.add(signinTitle);
        frame.add(nameLabel);
        frame.add(name);
        frame.add(cynameLabel);
        frame.add(cyName);
        frame.add(pcnoLabel);
        frame.add(pcno);
        frame.add(monoLabel);
        frame.add(mono);
        frame.add(stateLabel);
        frame.add(state);
        frame.add(cityLabel);
        frame.add(city);
        frame.add(passLabel);
        frame.add(pass);
        frame.add(signinSubmit);

        frame.setLayout(null);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }








    // Login Page
    public void login(JFrame frame,MenuBar mbar){
        frame.dispose();
        frame.getContentPane().removeAll();
        mbar.remove(0);
        signinmenu.add(signin);
        signin.setFont(new Font("SansSerif",Font.PLAIN,15));
        signinmenu.setFont(new Font("SansSerif",Font.PLAIN,15));
        mbar.add(signinmenu);

        // Setting The Font and Font Size In short Styles

        title.setFont(new Font("SansSerif",Font.BOLD,35));
        loginTitle.setFont(new Font("SansSerif",Font.BOLD,30));
        usernameLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        passLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        username.setFont(new Font("SansSerif",Font.PLAIN,20));
        passl.setFont(new Font("SansSerif",Font.PLAIN,20));
        loginSubmit.setFont(new Font("SansSerif",Font.PLAIN,20));
        loginSubmit.setBackground(Color.black);
        loginSubmit.setForeground(Color.white);



        //Setting The Position
        title.setBounds((int)(dimension.getWidth()/2-title.getWidth()/2-260),20,700,100);
        loginTitle.setBounds((int)(dimension.getWidth()/2-loginTitle.getWidth()/2-100),80,700,100);
        username.setBounds(((int)(dimension.getWidth()/2)+70),300,200,30);
        usernameLabel.setBounds(((int)(dimension.getWidth()/2)-(usernameLabel.getWidth()+username.getWidth())),300,200,25);
        passl.setBounds(((int)(dimension.getWidth()/2+70)),340,200,30);
        passLabel.setBounds(((int)(dimension.getWidth()/2)-(passLabel.getWidth()+passl.getWidth())),340,300,25);
        loginSubmit.setBounds(((int)(dimension.getWidth()/2)-(signinSubmit.getWidth()/2)-50),450,120,40);


        //Adding to The JFrame
        frame.add(title);
        frame.add(loginTitle);
        frame.add(usernameLabel);
        frame.add(username);
        frame.add(passl);
        frame.add(passLabel);
        frame.add(loginSubmit);

        loginSubmit.addActionListener(this);
        signin.addActionListener(this);
        frame.setVisible(true);
    }



    // Data Members For The Homepage
    private Menu options = new Menu("Options");
    private MenuItem find = new MenuItem("Find a Customer");
    private MenuItem addc = new MenuItem("Add a Customer");
    private MenuItem info = new MenuItem("My Information");
    private MenuItem logout = new MenuItem("Log Out");
    private JLabel addacustomertitle = new JLabel("Add a Customer");
    private JLabel cnameLabel = new JLabel("Enter The Customer's Name");
    private JLabel cminLabel = new JLabel("Enter How Many Minutes Used");
    private JLabel cmonoLabel = new JLabel("Enter The Customer's Mobile No.");
    private JLabel cpcnoLabel = new JLabel("Enter The Number of the PC used");
    private JTextField cname = new JTextField();
    private JTextField cmin = new JTextField();
    private JTextField cmono = new JTextField();
    private JTextField cpcno = new JTextField();
    private Button addacustomer = new Button("Add");

    // Homepage
    void homepage(JFrame frame, MenuBar mbar, String uname, String upass){

        mainusername = uname;
        mainpass = upass;


        // Menubar and Frame Settings
        frame.dispose();
        frame.getContentPane().removeAll();
        mbar.remove(0);
        options.add(find);
        options.add(addc);
        options.add(info);
        options.add(logout);
        options.setFont(new Font("SansSerif",Font.PLAIN,15));
        info.setFont(new Font("SansSerif",Font.PLAIN,15));
        addc.setFont(new Font("SansSerif",Font.PLAIN,15));
        info.setFont(new Font("SansSerif",Font.PLAIN,15));
        logout.setFont(new Font("SansSerif",Font.PLAIN,15));
        mbar.add(options);




        // Adding ActionListners
        logout.addActionListener(this);
        addc.addActionListener(this);
        info.addActionListener(this);
        find.addActionListener(this);

        // Setting Fonts and size of the Fonts
        title.setFont(new Font("SansSerif",Font.BOLD,35));
        addacustomertitle.setFont(new Font("SansSerif",Font.BOLD,33));
        cnameLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        cminLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        cmonoLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        cpcnoLabel.setFont(new Font("SansSerif",Font.PLAIN,20));
        cname.setFont(new Font("SansSerif",Font.PLAIN,20));
        cmin.setFont(new Font("SansSerif",Font.PLAIN,20));
        cmono.setFont(new Font("SansSerif",Font.PLAIN,20));
        cpcno.setFont(new Font("SansSerif",Font.PLAIN,20));
        addacustomer.setFont(new Font("SansSerif",Font.PLAIN,20));
        addacustomer.setBackground(Color.black);
        addacustomer.setForeground(Color.white);




        // Setting the Positions
        title.setBounds((int)(dimension.getWidth()/2-title.getWidth()/2-260),20,700,100);
        addacustomertitle.setBounds((int)(dimension.getWidth()/2-addacustomertitle.getWidth()/2-100),80,700,100);
        cname.setBounds(((int)(dimension.getWidth()/2)+70),240,200,30);
        cnameLabel.setBounds(((int)(dimension.getWidth()/2)-290),240,320,25);
        cmin.setBounds(((int)(dimension.getWidth()/2)+70),280,200,30);
        cminLabel.setBounds(((int)(dimension.getWidth()/2)-290),280,320,25);
        cmono.setBounds(((int)(dimension.getWidth()/2)+70),320,200,30);
        cmonoLabel.setBounds(((int)(dimension.getWidth()/2)-290),320,320,25);
        cpcno.setBounds(((int)(dimension.getWidth()/2)+70),360,200,30);
        cpcnoLabel.setBounds(((int)(dimension.getWidth()/2)-290),360,320,25);
        addacustomer.setBounds(((int)(dimension.getWidth()/2)-(addacustomer.getWidth()/2)-50),440,120,40);


        // Adding Action Listner to the addacustomer button
        addacustomer.addActionListener(this);


        // Adding The Components to The frame
        frame.add(title);
        frame.add(addacustomertitle);
        frame.add(cnameLabel);
        frame.add(cname);
        frame.add(cminLabel);
        frame.add(cmin);
        frame.add(cmonoLabel);
        frame.add(cmono);
        frame.add(cpcnoLabel);
        frame.add(cpcno);
        frame.add(addacustomer);



        frame.setVisible(true);
    }



    // Information Window

    JLabel infotitle = new JLabel("My Information");
    JLabel iname = new JLabel();
    JLabel icyname = new JLabel();
    JLabel ipcno = new JLabel();
    JLabel imono = new JLabel();
    JLabel istate = new JLabel();
    JLabel icity = new JLabel();
    JLabel ipass = new JLabel();




    void information(JFrame frame, MenuBar mbar,String url){
        String fusename,fpass,fcyname,fmono,fstate,fcity;
        int fpcno;
        frame.dispose();
        frame.getContentPane().removeAll();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from admin where name='"+mainusername+"' and pass='"+mainpass+"'");

            while(resultSet.next()) {
                fusename = resultSet.getString("name");
                fcyname = resultSet.getString("cyname");
                fpcno = resultSet.getInt("pcno");
                fmono = resultSet.getString("mono");
                fstate = resultSet.getString("state");
                fcity = resultSet.getString("city");
                fpass = resultSet.getString("pass");
                if ((fpass.equals(mainpass)) && (fusename.equalsIgnoreCase(mainusername))){
                    iname.setText("The UserName is "+fusename);
                    icyname.setText("The CyberCafe Name is "+fcyname);
                    ipcno.setText("The Number of PCs is "+fpcno);
                    imono.setText("The Mobile Number is "+fmono);
                    istate.setText("The Name of The State is "+fstate);
                    icity.setText("The Name of The City is "+fcity);
                    ipass.setText("The Password is "+fpass);
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }


        // Fonts
        title.setFont(new Font("SansSerif",Font.BOLD,35));
        infotitle.setFont(new Font("SansSerif",Font.BOLD,33));
        iname.setFont(new Font("SansSerif",Font.PLAIN,20));
        icyname.setFont(new Font("SansSerif",Font.PLAIN,20));
        ipcno.setFont(new Font("SansSerif",Font.PLAIN,20));
        imono.setFont(new Font("SansSerif",Font.PLAIN,20));
        istate.setFont(new Font("SansSerif",Font.PLAIN,20));
        icity.setFont(new Font("SansSerif",Font.PLAIN,20));
        ipass.setFont(new Font("SansSerif",Font.PLAIN,20));



        // Setting The Positions
        title.setBounds((int)(dimension.getWidth()/2-title.getWidth()/2-260),20,700,100);
        infotitle.setBounds((int)(dimension.getWidth()/2-infotitle.getWidth()/2-100),80,700,100);
        iname.setBounds(((int)(dimension.getWidth()/2-150)),240,600,30);
        icyname.setBounds(((int)(dimension.getWidth()/2-150)),280,600,30);
        ipcno.setBounds(((int)(dimension.getWidth()/2-150)),320,600,30);
        imono.setBounds(((int)(dimension.getWidth()/2-150)),360,600,30);
        istate.setBounds(((int)(dimension.getWidth()/2-150)),400,600,30);
        icity.setBounds(((int)(dimension.getWidth()/2-150)),440,600,30);
        ipass.setBounds(((int)(dimension.getWidth()/2-150)),480,600,30);



        // Adding onto The Frame
        frame.add(title);
        frame.add(infotitle);
        frame.add(iname);
        frame.add(icyname);
        frame.add(ipcno);
        frame.add(imono);
        frame.add(istate);
        frame.add(icity);
        frame.add(ipass);



        // Setting The Frame as Visible
        frame.setVisible(true);
    }




    // Function for Finding a Customer

    JLabel findtitle = new JLabel("Information of The Customer");
    JLabel fcname = new JLabel();
    JLabel fcmin = new JLabel();
    JLabel fcmono = new JLabel();
    JLabel fcpcno = new JLabel();

    void findtheCustomer(JFrame frame, MenuBar mbar, String customername, String url){
        frame.dispose();
        frame.getContentPane().removeAll();
        String fname,fmono;
        int fmin,fpcno;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement statement = con.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from "+mainusername+" where name='"+customername+"'");
            while(resultSet.next()) {
                fname = resultSet.getString("name");
                fmin = resultSet.getInt("minutes");
                fmono = resultSet.getString("mono");
                fpcno = resultSet.getInt("pcno");
                if (fname.equalsIgnoreCase(customername)){
                    fcname.setText("The Name of The Customer is "+fname);
                    fcmin.setText("He used The Computer for "+fmin+" Minutes");
                    fcmono.setText("The Mobile No. of The Customer is "+fmono);
                    fcpcno.setText("The Number of The PC used by him is "+fpcno);
                }
            }

            if(fcname.getText().equals("")){
                fcname.setText("The Customer Does Not Exist in The Database");
            }

        }
        catch (Exception ex){
            System.out.println(ex);
        }



        // Fonts
        title.setFont(new Font("SansSerif",Font.BOLD,35));
        findtitle.setFont(new Font("SansSerif",Font.BOLD,33));
        fcname.setFont(new Font("SansSerif",Font.PLAIN,20));
        fcmin.setFont(new Font("SansSerif",Font.PLAIN,20));
        fcmono.setFont(new Font("SansSerif",Font.PLAIN,20));
        fcpcno.setFont(new Font("SansSerif",Font.PLAIN,20));





        // Setting The Positions
        title.setBounds((int)(dimension.getWidth()/2-title.getWidth()/2-260),20,700,100);
        findtitle.setBounds((int)(dimension.getWidth()/2-findtitle.getWidth()/2-200),80,700,100);
        fcname.setBounds(((int)(dimension.getWidth()/2-170)),240,600,30);
        fcmin.setBounds(((int)(dimension.getWidth()/2-170)),280,600,30);
        fcmono.setBounds(((int)(dimension.getWidth()/2-170)),320,600,30);
        fcpcno.setBounds(((int)(dimension.getWidth()/2-170)),360,600,30);




        // Adding it On The Frame
        frame.add(title);
        frame.add(findtitle);
        frame.add(fcname);
        frame.add(fcmin);
        frame.add(fcmono);
        frame.add(fcpcno);


        //Setting The Frame Visible
        frame.setVisible(true);
    }




    // main Function
    public static void main(String[] args) {
        Main m = new Main();
        m.signin(frame, mbar);
    }





    JLabel admintitle = new JLabel("Admin Interface");
    JLabel please = new JLabel("Please go on this url :");
    JLabel url = new JLabel("http://localhost/phpmyadmin");



    void adminlogin(JFrame frame, MenuBar mbar){
        frame.dispose();
        frame.getContentPane().removeAll();


        // Setting The Fonts
        title.setFont(new Font("SansSerif",Font.BOLD,35));
        admintitle.setFont(new Font("SansSerif",Font.BOLD,33));
        please.setFont(new Font("SansSerif",Font.PLAIN,28));
        url.setFont(new Font("SansSerif",Font.PLAIN,20));



        // Setting The Position
        title.setBounds((int)(dimension.getWidth()/2-title.getWidth()/2-260),20,700,100);
        admintitle.setBounds((int)(dimension.getWidth()/2-admintitle.getWidth()/2-150),80,700,100);
        please.setBounds(((int)(dimension.getWidth()/2-170)),240,600,35);
        url.setBounds(((int)(dimension.getWidth()/2-170)),290,600,30);


        // Adding it on The Frame
        frame.add(title);
        frame.add(admintitle);
        frame.add(please);
        frame.add(url);

        // Setting The Frame as Visible
        frame.setVisible(true);
    }


    // Signintemmp
    public void signintemmp(JFrame frame, MenuBar mbar){
        frame.dispose();
        frame.getContentPane().removeAll();
        mbar.remove(0);
        Main m = new Main();
        m.signin(frame,mbar);
    }








    //All Action Listners
    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "jdbc:mysql://localhost:3306/microproject";
        String dname = "root" , dpass = "";
        Main m = new Main();
        if(e.getSource() == login){
            m.login(frame,mbar);
        }




        if (e.getSource() == signin){
            m.signintemmp(frame,mbar);
        }




        if (e.getSource() == addc){
            m.homepage(frame,mbar,mainusername,mainpass);
        }




        if (e.getSource() == signinSubmit){
            try{
                if(name.getText() != "" && cyName.getText() != "" && pcno.getText() != "" && mono.getText() != "" && state.getText() != "" && city.getText() != "" && pass.getText() != "") {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url, dname, dpass);
                    Statement statement = con.createStatement();
                    statement.executeUpdate("insert into admin values(\"" + name.getText() + "\",\"" + cyName.getText() + "\",\"" + Integer.parseInt(pcno.getText()) + "\",\"" + mono.getText() + "\",\"" + state.getText() + "\",\"" + city.getText() + "\",\"" + pass.getText() + "\")");
                    statement.executeUpdate("create table "+name.getText()+"(name varchar(45),minutes int(10),mono varchar(15),pcno int(10))");
                    m.homepage(frame,mbar,name.getText(),pass.getText());
                }
            }
            catch (Exception ex){
                System.out.println(ex);
            }
        }




        if (e.getSource() == loginSubmit){
            if (username.getText().equals("admin") && passl.getText().equals(adminpass)){
                m.adminlogin(frame, mbar);
            }
            else {
                try{
                    if(username.getText() != "" && passl.getText() != ""){
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        String fusename,fpass;
                        Connection con = DriverManager.getConnection(url,dname,dpass);
                        Statement statement = con.createStatement();
                        ResultSet resultSet;
                        resultSet = statement.executeQuery("select * from admin where name='"+username.getText()+"' and pass='"+passl.getText()+"'");
                        while(resultSet.next()) {
                            fpass = resultSet.getString("pass");
                            fusename = resultSet.getString("name");
                            if (fpass.equals(passl.getText()) && fusename.equalsIgnoreCase(username.getText())){
                                m.homepage(frame,mbar,fusename,fpass);
                                break;
                            }
                        }
                        username.setText("");
                        passl.setText("");
                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(frame,"Invalid Username/Password","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }





        if(e.getSource()==addacustomer){
            try{
                if(cname.getText()!="" && cmin.getText()!="" && cmono.getText()!="" && cpcno.getText()!=""){
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url,dname,dpass);
                    Statement statement = con.createStatement();
                    statement.executeUpdate("insert into "+mainusername+" values('"+cname.getText()+"',"+Integer.parseInt(cmin.getText())+",'"+cmono.getText()+"',"+Integer.parseInt(cpcno.getText())+")");
                    cname.setText("");
                    cmin.setText("");
                    cmono.setText("");
                    cpcno.setText("");
                    JOptionPane.showMessageDialog(frame,"Customer is Added","info",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (Exception ex){
                System.out.println(ex);
            }
        }





        if( e.getSource() == logout){
            int yn = JOptionPane.showConfirmDialog(frame,"Are You Sure to Logout","Logout",JOptionPane.YES_NO_OPTION);
            if(yn == JOptionPane.YES_OPTION) {
                m.login(frame, mbar);
            }
        }






        if(e.getSource() == info){
            String fpass = JOptionPane.showInputDialog("Enter Your Password");
            if(mainpass.equals(fpass)){
                m.information(frame , mbar, url);
            }
            else{
                JOptionPane.showMessageDialog(frame, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }



        if(e.getSource() == find){
            String customerName = JOptionPane.showInputDialog("What is The Name of The Customer You Want to Find");
            if(customerName.equals("")){

            }
            else {
                m.findtheCustomer(frame,mbar,customerName, url);
            }
        }

    }
}