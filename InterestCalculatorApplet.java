import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterestCalculatorApplet extends Applet implements ActionListener {
    private TextField principalField, rateField, yearsField;
    private Label simpleInterestLabel, compoundInterestLabel,compoundingLabel;
    private Choice dropDown;

    @Override
    public void init() {

        // Create and configure text fields
	dropDown=new Choice();
	dropDown.addItem("Yearly");
	dropDown.addItem("Half Yearly");
	dropDown.addItem("Monthly");
	dropDown.addItem("Quarterly");

        principalField = new TextField(10);
        rateField = new TextField(10);
        yearsField = new TextField(10);

        // Create labels
        Label principalLabel = new Label("Principal Amount:");
        Label rateLabel = new Label("Rate of Interest:");
        Label yearsLabel = new Label("No. of Years:");
        simpleInterestLabel = new Label("Simple Interest:");
        compoundInterestLabel = new Label("Compound Interest:");
        compoundingLabel = new Label("Compounding:");

        // Create button
        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);

        // Add components to the applet
        add(principalLabel);
        add(principalField);
        add(rateLabel);
        add(rateField);
        add(yearsLabel);
        add(yearsField);
	add(compoundingLabel);
	add(dropDown);
        add(calculateButton);
        add(simpleInterestLabel);
        add(compoundInterestLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            // Get input values
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            int years = Integer.parseInt(yearsField.getText());
            int compounding=0;
		
		if(dropDown.getSelectedItem().equalsIgnoreCase("Yearly"))
			compounding=1;
		else if(dropDown.getSelectedItem().equalsIgnoreCase("Half Yearly"))
			compounding=2;
		else if(dropDown.getSelectedItem().equalsIgnoreCase("monthly"))
			compounding=12;
		else if(dropDown.getSelectedItem().equalsIgnoreCase("quarterly"))
			compounding=4;


            // Calculate simple interest
            double simpleInterest = (principal * rate * years) / 100;

            // Calculate compound interest
		double r = rate/(compounding*100);
            double compoundInterest = principal * Math.pow((1 + r), years*compounding) - principal;
            // Update labels with results
            simpleInterestLabel.setText("Simple Interest: " + simpleInterest);
            compoundInterestLabel.setText("Compound Interest: " + compoundInterest);
            
        }
    }
}
