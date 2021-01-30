package kata4.main;

import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.persistence.MailListReader;
import kata4.model.Histogram;
import java.util.List;


public class Kata4 {
    public static void main(String[] args) {
        String  nombreFile = new String ("email.txt");
        List<Mail> mailList = MailListReader.read(nombreFile);
        Histogram <String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}
