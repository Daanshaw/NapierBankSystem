package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.*;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;


public class MainFrame extends JFrame {

    private javax.swing.JPanel mainPanel;
    private JLabel projectNameLbl;
    private JTextField msgHeaderTxt;
    private JTextField msgSenderTxt;
    private JTextArea msgBodyTxt;
    private JButton sendBtn;

    private JLabel msgTypeLbl;
    private JTextField msgSubjectTxt;
    private JLabel charCountSubject;
    private JLabel charCountSender;
    private JComboBox natureOfIncidentBox;
    private JLabel natureOfIncidentLbl;
    private JTextField dateTxt;
    private JTextField sortCodeTxt;
    //private JFileChooser button1;
    private JButton loadProcessedMessageBtn;
    private JTextField msgTypeTxtField;


    private static final String headerPattern =
            "^[a-zA-Z]+\\d\\d\\d\\d\\d\\d\\d\\d\\d$";


    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Napier Bank Message Filtering System");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        natureOfIncidentLbl.setVisible(false);
        natureOfIncidentBox.setVisible(false);

        charCountSubject.setVisible(false);
        charCountSender.setVisible(false);
        dateTxt.setVisible(false);
        sortCodeTxt.setVisible(false);
        msgSubjectTxt.setVisible(false);

        natureOfIncidentBox.addItem("Theft");
        natureOfIncidentBox.addItem("Staff Attack");
        natureOfIncidentBox.addItem("ATM Theft");
        natureOfIncidentBox.addItem("Raid");
        natureOfIncidentBox.addItem("Customer Attack");
        natureOfIncidentBox.addItem("Staff Abuse");
        natureOfIncidentBox.addItem("Bomb Threat");
        natureOfIncidentBox.addItem("Terrorism");
        natureOfIncidentBox.addItem("Suspicious incident");
        natureOfIncidentBox.addItem("Intelligence");
        natureOfIncidentBox.addItem("Cash loss");

        Patterns pattern = new Patterns();



        msgSubjectTxt.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {

                if (msgSubjectTxt.getText().contains("SIR")) {

                    msgTypeLbl.setText("SIR");

                    msgBodyTxt.setEditable(true);
                    msgSubjectTxt.setEditable(true);
                    charCountSubject.setVisible(false);
                    msgSenderTxt.setText("Sender email");
                    msgSenderTxt.setEditable(true);
                    charCountSender.setVisible(false);
                    natureOfIncidentLbl.setVisible(true);
                    natureOfIncidentBox.setVisible(true);
                    dateTxt.setVisible(true);
                    sortCodeTxt.setVisible(true);

                }
            }

            public void removeUpdate(DocumentEvent e) {

            }

            public void changedUpdate(DocumentEvent e) {

            }
        });


        //checks for changes in Sender text field to detect the message type

        msgHeaderTxt.getDocument().addDocumentListener(new DocumentListener() {

            public void changedUpdate(DocumentEvent arg0) {

            }

            public void insertUpdate(DocumentEvent arg0) {
                if (msgHeaderTxt.getText().contains("S")) {

                    msgTypeLbl.setText("SMS");


                    msgSubjectTxt.setEditable(false);
                    charCountSubject.setVisible(false);
                    msgSenderTxt.setText("Sender telephone number");
                    msgBodyTxt.setEditable(true);
                    msgSenderTxt.setEditable(true);
                    charCountSender.setVisible(false);
                    natureOfIncidentLbl.setVisible(false);

                } else if (msgHeaderTxt.getText().contains("E")) {

                    msgTypeLbl.setText("Email");
                    msgSubjectTxt.setVisible(true);
                    //charCountSubject.setVisible(true);
                    msgSubjectTxt.setEditable(true);

                    msgSenderTxt.setText("Sender email");
                    msgSenderTxt.setEditable(true);
                    charCountSender.setVisible(false);
                    msgBodyTxt.setEditable(true);
                    natureOfIncidentLbl.setVisible(false);

                } else if (msgHeaderTxt.getText().contains("T")) {

                    msgTypeLbl.setText("Tweet");


                    charCountSubject.setVisible(false);
                    msgSubjectTxt.setEditable(false);
                    msgSenderTxt.setEditable(true);
                    msgSenderTxt.setText("Twitter ID");
                    //charCountSender.setVisible(true);
                    msgBodyTxt.setEditable(true);
                    natureOfIncidentLbl.setVisible(false);
                } else if (msgHeaderTxt.getText().equals("")) {

                    msgTypeLbl.setText("Message type");

                    msgBodyTxt.setEditable(false);
                    msgSubjectTxt.setEditable(false);
                    charCountSubject.setVisible(false);
                    msgSenderTxt.setText("");
                    msgSenderTxt.setEditable(false);
                    charCountSender.setVisible(false);
                    natureOfIncidentLbl.setVisible(false);
                    natureOfIncidentBox.setVisible(false);
                }

//
            }

            public void removeUpdate(DocumentEvent arg0) {
                if (msgTypeLbl.getText().contains("S")) {

                    msgTypeLbl.setText("SMS");


                    msgSubjectTxt.setEditable(false);
                    charCountSubject.setVisible(false);
                    msgSenderTxt.setText("Sender telephone number");
                    msgBodyTxt.setEditable(true);
                    msgSenderTxt.setEditable(true);
                    charCountSender.setVisible(false);
                    msgBodyTxt.setEditable(true);
                    natureOfIncidentLbl.setVisible(false);


                } else if (msgHeaderTxt.getText().contains("E")) {

                    msgTypeLbl.setText("Email");
                    msgSubjectTxt.setEditable(true);
                   // charCountSubject.setVisible(true);


                    msgSenderTxt.setText("Sender email");
                    msgSenderTxt.setEditable(true);
                    charCountSender.setVisible(false);
                    msgBodyTxt.setEditable(true);
                    natureOfIncidentLbl.setVisible(false);
                } else if (msgHeaderTxt.getText().contains("T")) {

                    msgTypeLbl.setText("Tweet");


                    charCountSubject.setVisible(false);
                    msgSubjectTxt.setEditable(false);
                    msgSenderTxt.setEditable(true);
                    msgSenderTxt.setText("Twitter ID");
                    //charCountSender.setVisible(true);
                    msgBodyTxt.setEditable(true);
                    natureOfIncidentLbl.setVisible(false);
                } else if (msgHeaderTxt.getText().equals("")) {

                    msgTypeLbl.setText("Message type");

                    msgBodyTxt.setEditable(false);
                    msgSubjectTxt.setEditable(false);
                    msgSubjectTxt.setVisible(false);
                    charCountSubject.setVisible(false);
                    msgSenderTxt.setText("");
                    msgSenderTxt.setEditable(false);
                    charCountSender.setVisible(false);
                    natureOfIncidentLbl.setVisible(false);
                    natureOfIncidentBox.setVisible(false);
                }
//
            }
        });

        //limits the length of header to 10 characters

        msgHeaderTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (msgHeaderTxt.getText().length() >= 10) {
                    e.consume();
                }
            }
        });

        //limits the length of telephone number to 12 digits and restricts to accept only numbers in textfield

        msgSenderTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (msgHeaderTxt.getText().contains("S") || (msgHeaderTxt.getText().contains("s"))) {
                    if (msgSenderTxt.getText().length() >= pattern.getTelephoneNumberCount()) {
                        e.consume();

                    }
                    if (!msgSenderTxt.getText().matches("[0-9]*")) {
                        msgSenderTxt.setText(msgSenderTxt.getText().substring(0, msgSenderTxt.getText().length() - 1));
                        JOptionPane.showMessageDialog(null, "Number only!", "Invalid Input", JOptionPane.ERROR_MESSAGE);


                    }

                } else if (msgHeaderTxt.getText().contains("E") || (msgHeaderTxt.getText().contains("e"))) {

                    if (msgSenderTxt.getText().length() >= 30) {
                        e.consume();


                    }

                }
            }
        });

        msgSubjectTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (msgSubjectTxt.getText().length() >= 20) {
                    e.consume();

                }
            }
        });

        msgBodyTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (msgHeaderTxt.getText().contains("S") || (msgHeaderTxt.getText().contains("s"))) {
                    if (msgBodyTxt.getText().length() >= pattern.getSmsBodyCount()) {
                        e.consume();

                    }


                } else if (msgHeaderTxt.getText().contains("E") || (msgHeaderTxt.getText().contains("e"))) {

                    if (msgBodyTxt.getText().length() >= pattern.getEmailBodyCount()) {
                        e.consume();


                    }

                }
            }
        });



        //do not allow to input any non-ASCII characters then limits the length depending on message type



        //clears the fields after clicking mouse on them


        msgHeaderTxt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                msgHeaderTxt.setText("");
            }
        });
        msgSenderTxt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                msgSenderTxt.setText("");
            }
        });
        msgBodyTxt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                msgBodyTxt.setText("");
            }
        });
        dateTxt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                msgBodyTxt.setText("");
            }
        });
        sortCodeTxt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                msgBodyTxt.setText("");
            }
        });


        //checks for any blank text fields

        sendBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (msgHeaderTxt.getText().equals("") || msgSenderTxt.getText().equals("") || msgBodyTxt.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Please enter all fields!");

                } else {
                    //checks if there is appropriate header pattern in header text field

                    if (msgHeaderTxt.getText().matches(headerPattern) && msgHeaderTxt.getText().length() == 10) {

                        if (msgHeaderTxt.getText().contains("S") || (msgHeaderTxt.getText().contains("s"))) {


                            AbbreviationExpander exp = new AbbreviationExpander();


                            //function to expand all abbreviations

                            String bodySms = AbbreviationExpander.abbreviationExpander(msgBodyTxt.getText());

                            MessageWriter ewx = new MessageWriter();
                            ewx.messageWriter(msgHeaderTxt.getText(), msgSenderTxt.getText(), bodySms, msgTypeLbl.getText());

                            msgBodyTxt.setText(bodySms);
                            JOptionPane.showMessageDialog(null, "SMS processed!");

                        } else if (msgHeaderTxt.getText().substring(0, 1).matches("E") || (msgHeaderTxt.getText().substring(0, 1).matches("e"))) {
                            Email email = new Email();
                            if (!msgSenderTxt.getText().matches(pattern.getEmailPattern())) {

//
                                JOptionPane.showMessageDialog(null, "Invalid email format. ", "Invalid Input", JOptionPane.ERROR_MESSAGE);


                            } else {

                                if (msgTypeLbl.getText().matches("SIR")) {

                                    if (!sortCodeTxt.getText().matches(pattern.getSortCodePattern())){

                                        JOptionPane.showMessageDialog(null, "Invalid sort code format. ", "Invalid Input", JOptionPane.ERROR_MESSAGE);

                                    }
                                    else{

                                        //function to quarantine all links and write them to file

                                        HyperlinksQuarantiner hq = new HyperlinksQuarantiner();
                                        Extractor ex = new Extractor();
                                        List<String> extractedUrls = Extractor.extractor(msgBodyTxt.getText(), pattern.getUrlPattern());
                                        String sirBody = HyperlinksQuarantiner.hyperlinksQuarantiner(msgBodyTxt.getText(), extractedUrls);


                                        //function to write SIR to file

                                        MessageWriter ewx = new MessageWriter();
                                        ewx.messageWriter(msgHeaderTxt.getText(), msgSenderTxt.getText(), msgSubjectTxt.getText(), msgBodyTxt.getText(), sortCodeTxt.getText(), natureOfIncidentBox.getSelectedItem().toString(), dateTxt.getText(), msgTypeLbl.getText());
                                        ewx.messageWriter(extractedUrls, "quarantinedLinks");
                                        ewx.messageWriter(sortCodeTxt.getText(), natureOfIncidentBox.getSelectedItem().toString());

                                        msgBodyTxt.setText(sirBody);
                                        JOptionPane.showMessageDialog(null, "SIR processed!");
                                        JOptionPane.showMessageDialog(null, sortCodeTxt.getText() + " " + natureOfIncidentBox.getSelectedItem().toString(), "SIR List", JOptionPane.INFORMATION_MESSAGE);
                                    }

                                } else {


                                    //function to quarantine all links and write them to file

                                    HyperlinksQuarantiner hq = new HyperlinksQuarantiner();
                                    Extractor ex = new Extractor();
                                    List<String> extractedUrls = Extractor.extractor(msgBodyTxt.getText(), pattern.getUrlPattern());

                                    String bodyEmail = HyperlinksQuarantiner.hyperlinksQuarantiner(msgBodyTxt.getText(), extractedUrls);

                                    MessageWriter ew = new MessageWriter();
                                    ew.messageWriter(extractedUrls, "quarantinedLinks");
                                    ew.messageWriter(msgHeaderTxt.getText(), msgSenderTxt.getText(), msgSubjectTxt.getText(), bodyEmail, msgTypeLbl.getText());

                                    msgBodyTxt.setText(bodyEmail);

                                    JOptionPane.showMessageDialog(null, "Email processed!");
                                }
                            }

                        } else if (msgHeaderTxt.getText().contains("T") || (msgHeaderTxt.getText().contains("t"))) {
                            Tweet tweet = new Tweet();
                            if (msgSenderTxt.getText().matches(pattern.getTwitterIdPattern())) {


                                AbbreviationExpander exp = new AbbreviationExpander();

                                //function to expand all abbreviations

                                String bodyTweet = AbbreviationExpander.abbreviationExpander(msgBodyTxt.getText());


                                Extractor ex = new Extractor();
                                UseCounter uc = new UseCounter();
                                List<String> extractedHashtags = Extractor.extractor(msgBodyTxt.getText(), pattern.getHashtagPattern());
                                List<String> extractedTwitterIds = Extractor.extractor(msgBodyTxt.getText(), pattern.getTwitterIdPattern());
                                HashMap<String, String> extractedHashtagsC = uc.counter(extractedHashtags);
                                HashMap<String, String> extractedTwitterIdsC = uc.counter(extractedTwitterIds);


                                //function to extract hashtags and write them to trending list with number of uses

//                                HashtagsWriter hw = new HashtagsWriter();
//                                hw.hashtagWriter(tweetMessage);

//                                TwitterListCreator tlc = new TwitterListCreator();
//                                HashMap<String, Integer> hashtags = tlc.hashtagWriter(msgBodyTxt.getText());


                                //function to extract mentions and write them to mentions list with number of uses

//                                MentionsWriter mw = new MentionsWriter();
//                                mw.mentionsWriter(msgBodyTxt.getText());

                                //function to expand all abbreviations
//                                HyperlinksQuarantiner hq = new HyperlinksQuarantiner();
//                                bodyTweet = hq.hyperlinksQuarantiner(msgBodyTxt.getText());

                                MessageWriter ew = new MessageWriter();
                                ew.messageWriter(msgHeaderTxt.getText(), msgSenderTxt.getText(), bodyTweet, msgTypeLbl.getText());
                                ew.messageWriter(extractedHashtagsC, "trendingList");
                                ew.messageWriter(extractedTwitterIdsC, "mentionsList");



                                msgBodyTxt.setText(bodyTweet);


                                JOptionPane.showMessageDialog(null, "Tweet processed!");

                                JOptionPane.showMessageDialog(null, extractedHashtagsC, "Trending list", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, extractedTwitterIdsC, "Mentions list", JOptionPane.INFORMATION_MESSAGE);
                            } else {

                                JOptionPane.showMessageDialog(null, "Invalid twitter ID format. ", "Invalid Input", JOptionPane.ERROR_MESSAGE);

                            }
                        }


                    }
                    else {

                        JOptionPane.showMessageDialog(null, "Please enter header in correct format! ");
                    }

                }


            }
        });


    }


    public static void main(String[] args) {
        MainFrame xframe = new MainFrame();


    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}




