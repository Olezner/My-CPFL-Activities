
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Teen_Titans3 {
    public static void main(String[] args) throws IOException {
        String username;
        int life = 100;
        
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        
        // INTRO
        ImageIcon logo = new ImageIcon("logo.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, logo);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ImageIcon storyline = new ImageIcon("storyline.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, storyline);
        
        ImageIcon Cass = new ImageIcon("1.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, Cass);
        
        ImageIcon Bella = new ImageIcon("2.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, Bella);
        
        ImageIcon Luna = new ImageIcon("3.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, Luna);
        
        ImageIcon Linus = new ImageIcon("4.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, Linus);
        
        ImageIcon Blaze = new ImageIcon("5.gif");
        JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, Blaze);
        
        ImageIcon characters = new ImageIcon("char.gif");
        String[] options = { "Cassiopeia", "Bellatrix", "Luna", "Linus", "Blaze(Locked)" };
        ImageIcon icon = new ImageIcon("char.gif");
        Object ending = JOptionPane.showInputDialog(null, "Choose your Character", "TEEN TITANS",
        JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
        
        JOptionPane.showMessageDialog(null, "Your Life Points will start at 100! \n              Goodluck!", "Alert",
        JOptionPane.INFORMATION_MESSAGE);
        
        if (ending == options[0]) {
            JOptionPane.showMessageDialog(null, "You have chosen Linus \n              Goodluck!", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "You will be able to choose only 3 choices", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            
            {
                ImageIcon neptune1 = new ImageIcon("neptune1.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("neptune1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune2 = new ImageIcon("neptune2.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("neptune2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune3 = new ImageIcon("neptune3.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("neptune3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune4 = new ImageIcon("neptune4.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune5 = new ImageIcon("neptune5.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("neptune5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune6 = new ImageIcon("neptune6.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune7 = new ImageIcon("neptune7.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("neptune7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune8 = new ImageIcon("neptune8.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune9 = new ImageIcon("neptune9.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune10 = new ImageIcon("neptune10.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("neptune10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
                
                if (life == 0) {
                    ImageIcon res2 = new ImageIcon("gameover.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    System.exit(0);
                }
            }
            
            //URANUS LINUS
            
            {
                ImageIcon uranus = new ImageIcon("uranus1.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }    
            
            {
                ImageIcon uranus2 = new ImageIcon("uranus2.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus3 = new ImageIcon("uranus3.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("uranus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus4 = new ImageIcon("uranus4.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus5 = new ImageIcon("uranus5.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("uranus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus6 = new ImageIcon("uranus6.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus7 = new ImageIcon("uranus7.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("uranus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus8 = new ImageIcon("uranus8.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("uranus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus9 = new ImageIcon("uranus9.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus10 = new ImageIcon("uranus10.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //SATURN LINUS
            {
                ImageIcon saturn1 = new ImageIcon("saturn1.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn2 = new ImageIcon("saturn2.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("saturn2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn3 = new ImageIcon("saturn3.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn4 = new ImageIcon("saturn4.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("saturn4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn5 = new ImageIcon("saturn5.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("saturn5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn6 = new ImageIcon("saturn6.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn7 = new ImageIcon("saturn7.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("saturn7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn8 = new ImageIcon("saturn8.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn9 = new ImageIcon("saturn9.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn10 = new ImageIcon("saturn10.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("saturn10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //jUPITER LINUS
            
            {
                ImageIcon jupiter1 = new ImageIcon("jupiter1.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("jupiter1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter2 = new ImageIcon("jupiter2.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("jupiter2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon jupiter3 = new ImageIcon("jupiter3.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("jupiter3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon jupiter4 = new ImageIcon("jupiter4.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter5 = new ImageIcon("jupiter5.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter6 = new ImageIcon("jupiter6.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("jupiter6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter7 = new ImageIcon("jupiter7.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter8 = new ImageIcon("jupiter8.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter9 = new ImageIcon("jupiter9.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("jupiter9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter10 = new ImageIcon("jupiter10.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("jupiter10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //mars linus
            
            {
                ImageIcon mars1 = new ImageIcon("mars1.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mars1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars2 = new ImageIcon("mars2.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("mars2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars3 = new ImageIcon("mars3.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mars3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars4 = new ImageIcon("mars4.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars5 = new ImageIcon("mars5.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mars5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars6 = new ImageIcon("mars6.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("mars6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars7 = new ImageIcon("mars7.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("mars7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars8 = new ImageIcon("mars8.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mars8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars9 = new ImageIcon("mars9.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mars9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars10 = new ImageIcon("mars10.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("mars10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //EARTH LINUS
            
            {
                ImageIcon earth1 = new ImageIcon("earth1.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("earth1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth2 = new ImageIcon("earth2.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth3 = new ImageIcon("earth3.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth4 = new ImageIcon("earth4.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth5 = new ImageIcon("earth5.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("earth5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth6 = new ImageIcon("earth6.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("earth6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth7 = new ImageIcon("earth7.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("earth7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth8 = new ImageIcon("earth8.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("earth8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth9 = new ImageIcon("earth9.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("earth9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth10 = new ImageIcon("earth10.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //VENUS LINUS
            
            {
                ImageIcon venus1 = new ImageIcon("venus1.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus2 = new ImageIcon("venus2.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("venus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus3 = new ImageIcon("venus3.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("venus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 3;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus4 = new ImageIcon("venus4.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("venus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus5 = new ImageIcon("venus5.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("venus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus6 = new ImageIcon("venus6.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus7 = new ImageIcon("venus7.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("venus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus8 = new ImageIcon("venus8.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("venus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus9 = new ImageIcon("venus9.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("venus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus10 = new ImageIcon("venus10.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("venus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //MERCURY LINUS
            
            {
                ImageIcon mercury1 = new ImageIcon("mercury1.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("mercury1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury2 = new ImageIcon("mercury2.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury3 = new ImageIcon("mercury3.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury4 = new ImageIcon("mercury4.gif");
                String[] choices = { "A", "B", "C", " " };
                ImageIcon nep = new ImageIcon("mercury4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury5 = new ImageIcon("mercury5.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("mercury5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury6 = new ImageIcon("mercury6.gif");
                String[] choices = { "A", " ", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury7 = new ImageIcon("mercury7.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury8 = new ImageIcon("mercury8.gif");
                String[] choices = { " ", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury9 = new ImageIcon("mercury9.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("mercury9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury10 = new ImageIcon("mercury10.gif");
                String[] choices = { "A", "B", " ", "D" };
                ImageIcon nep = new ImageIcon("mercury10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            ImageIcon res2 = new ImageIcon("mission.gif");
            JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
            System.exit(0);
        }
        
        if (ending == options[1]) {
            JOptionPane.showMessageDialog(null, "You have chosen Bellatrix \n              Goodluck!", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Your life will be 150", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            int life1 = 150;
            
            {
                ImageIcon neptune1 = new ImageIcon("neptune1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune2 = new ImageIcon("neptune2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune3 = new ImageIcon("neptune3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune4 = new ImageIcon("neptune4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune5 = new ImageIcon("neptune5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune6 = new ImageIcon("neptune6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune7 = new ImageIcon("neptune7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune8 = new ImageIcon("neptune8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune9 = new ImageIcon("neptune9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune10 = new ImageIcon("neptune10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life1;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
                
                if (life1 == 0) {
                    ImageIcon res2 = new ImageIcon("gameover.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    System.exit(0);
                }
            }
            
            //URANUS BELLATRIX
            
            {
                ImageIcon uranus1 = new ImageIcon("uranus1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus2 = new ImageIcon("uranus2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus3 = new ImageIcon("uranus3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus4 = new ImageIcon("uranus4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus5 = new ImageIcon("uranus5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus6 = new ImageIcon("uranus6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus7 = new ImageIcon("uranus7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus8  = new ImageIcon("uranus8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus9 = new ImageIcon("uranus9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus10 = new ImageIcon("uranus10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            // SATURN BELLATRIX
            
            {
                ImageIcon saturn1 = new ImageIcon("saturn1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn2 = new ImageIcon("saturn2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn3 = new ImageIcon("saturn3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn4 = new ImageIcon("saturn4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn5 = new ImageIcon("saturn5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn6 = new ImageIcon("saturn6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn7 = new ImageIcon("saturn7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn8 = new ImageIcon("saturn8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn9 = new ImageIcon("saturn9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn10 = new ImageIcon("saturn10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            // JUPITER BELLATRIX
            
            {
                ImageIcon jupiter1 = new ImageIcon("jupiter1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter2 = new ImageIcon("jupiter2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter3 = new ImageIcon("jupiter3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter4 = new ImageIcon("jupiter4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter5 = new ImageIcon("jupiter5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter6 = new ImageIcon("jupiter6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter7 = new ImageIcon("jupiter7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter8 = new ImageIcon("jupiter8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter9 = new ImageIcon("jupiter9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter10 = new ImageIcon("jupiter10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //MARS BELLATRIX
            {
                ImageIcon mars1 = new ImageIcon("mars1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars2 = new ImageIcon("mars2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars3 = new ImageIcon("mars3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars4 = new ImageIcon("mars4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars5 = new ImageIcon("mars5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars6 = new ImageIcon("mars6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars7 = new ImageIcon("mars7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars8 = new ImageIcon("mars8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars9 = new ImageIcon("mars9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars10 = new ImageIcon("mars10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //EARTH BELLATRIX
            
            {
                ImageIcon earth1 = new ImageIcon("earth1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth2 = new ImageIcon("earth2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth3 = new ImageIcon("earth3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth4 = new ImageIcon("earth4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth5 = new ImageIcon("earth5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth6 = new ImageIcon("earth6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth7 = new ImageIcon("earth7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth8 = new ImageIcon("earth8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth9 = new ImageIcon("earth9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth10 = new ImageIcon("earth10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //VENUS BELLATRIX
            
            {
                ImageIcon venus1 = new ImageIcon("venus1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus2 = new ImageIcon("venus2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus3 = new ImageIcon("venus3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus4 = new ImageIcon("venus4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }        
            {
                ImageIcon venus5 = new ImageIcon("venus5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus6 = new ImageIcon("venus6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus7 = new ImageIcon("venus7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }        
            {
                ImageIcon venus8 = new ImageIcon("venus8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus9 = new ImageIcon("venus9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus10 = new ImageIcon("venus10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //MERCURY BELLATRIX
            
            {
                ImageIcon mercury1 = new ImageIcon("mercury1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury2 = new ImageIcon("mercury2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury3 = new ImageIcon("mercury3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury4 = new ImageIcon("mercury4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury5 = new ImageIcon("mercury5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury6 = new ImageIcon("mercury6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury7 = new ImageIcon("mercury7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury8 = new ImageIcon("mercury8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury9 = new ImageIcon("mercury9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury10 = new ImageIcon("mercury10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life1 = life1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life1 - damage;
                    life1 = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life1 == 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            ImageIcon res2 = new ImageIcon("mission.gif");
            JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
            System.exit(0);
        }
        
        if (ending == options[2]) {
            JOptionPane.showMessageDialog(null, "You have chosen Luna \n              Goodluck!", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "For every correct answer, you will gain 1 life point", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            
            {
                ImageIcon neptune1 = new ImageIcon("neptune1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune2 = new ImageIcon("neptune2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune3 = new ImageIcon("neptune3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune4 = new ImageIcon("neptune4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune5 = new ImageIcon("neptune5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune6 = new ImageIcon("neptune6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune7 = new ImageIcon("neptune7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune8 = new ImageIcon("neptune8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune9 = new ImageIcon("neptune9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune10 = new ImageIcon("neptune10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
                
                if (life <= 0) {
                    ImageIcon res2 = new ImageIcon("gameover.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    System.exit(0);
                }
            }
            
            //URANUS LINUS
            
            {
                ImageIcon uranus = new ImageIcon("uranus1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }    
            
            {
                ImageIcon uranus2 = new ImageIcon("uranus2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus3 = new ImageIcon("uranus3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus4 = new ImageIcon("uranus4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus5 = new ImageIcon("uranus5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus6 = new ImageIcon("uranus6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus7 = new ImageIcon("uranus7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus8 = new ImageIcon("uranus8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus9 = new ImageIcon("uranus9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus10 = new ImageIcon("uranus10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //SATURN LINUS
            {
                ImageIcon saturn1 = new ImageIcon("saturn1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn2 = new ImageIcon("saturn2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn3 = new ImageIcon("saturn3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn4 = new ImageIcon("saturn4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn5 = new ImageIcon("saturn5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn6 = new ImageIcon("saturn6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn7 = new ImageIcon("saturn7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn8 = new ImageIcon("saturn8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn9 = new ImageIcon("saturn9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn10 = new ImageIcon("saturn10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //jUPITER LINUS
            
            {
                ImageIcon jupiter1 = new ImageIcon("jupiter1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter2 = new ImageIcon("jupiter2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon jupiter3 = new ImageIcon("jupiter3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon jupiter4 = new ImageIcon("jupiter4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter5 = new ImageIcon("jupiter5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter6 = new ImageIcon("jupiter6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter7 = new ImageIcon("jupiter7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter8 = new ImageIcon("jupiter8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter9 = new ImageIcon("jupiter9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter10 = new ImageIcon("jupiter10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //mars linus
            
            {
                ImageIcon mars1 = new ImageIcon("mars1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars2 = new ImageIcon("mars2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars3 = new ImageIcon("mars3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars4 = new ImageIcon("mars4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars5 = new ImageIcon("mars5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars6 = new ImageIcon("mars6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars7 = new ImageIcon("mars7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars8 = new ImageIcon("mars8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars9 = new ImageIcon("mars9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars10 = new ImageIcon("mars10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //EARTH LINUS
            
            {
                ImageIcon earth1 = new ImageIcon("earth1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth2 = new ImageIcon("earth2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth3 = new ImageIcon("earth3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth4 = new ImageIcon("earth4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth5 = new ImageIcon("earth5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth6 = new ImageIcon("earth6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth7 = new ImageIcon("earth7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth8 = new ImageIcon("earth8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth9 = new ImageIcon("earth9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth10 = new ImageIcon("earth10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //VENUS LINUS
            
            {
                ImageIcon venus1 = new ImageIcon("venus1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus2 = new ImageIcon("venus2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus3 = new ImageIcon("venus3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus4 = new ImageIcon("venus4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus5 = new ImageIcon("venus5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus6 = new ImageIcon("venus6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus7 = new ImageIcon("venus7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus8 = new ImageIcon("venus8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus9 = new ImageIcon("venus9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus10 = new ImageIcon("venus10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //MERCURY LINUS
            
            {
                ImageIcon mercury1 = new ImageIcon("mercury1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury2 = new ImageIcon("mercury2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury3 = new ImageIcon("mercury3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury4 = new ImageIcon("mercury4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury5 = new ImageIcon("mercury5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury6 = new ImageIcon("mercury6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury7 = new ImageIcon("mercury7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury8 = new ImageIcon("mercury8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury9 = new ImageIcon("mercury9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury10 = new ImageIcon("mercury10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life = life + 1;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 5;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            ImageIcon res2 = new ImageIcon("mission.gif");
            JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
            System.exit(0);
        }
        
        if (ending == options[3]) {
            JOptionPane.showMessageDialog(null, "You have chosen Linus \n              Goodluck!", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Only 3 points will be deducted to your life for every wrong answers", "Alert",
            JOptionPane.INFORMATION_MESSAGE);
            
            {
                ImageIcon neptune1 = new ImageIcon("neptune1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune2 = new ImageIcon("neptune2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune3 = new ImageIcon("neptune3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune4 = new ImageIcon("neptune4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune5 = new ImageIcon("neptune5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune6 = new ImageIcon("neptune6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune7 = new ImageIcon("neptune7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune8 = new ImageIcon("neptune8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon neptune9 = new ImageIcon("neptune9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon neptune10 = new ImageIcon("neptune10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("neptune10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int hp = life;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
                
                if (life <= 0) {
                    ImageIcon res2 = new ImageIcon("gameover.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    System.exit(0);
                }
            }
            
            //URANUS LINUS
            
            {
                ImageIcon uranus = new ImageIcon("uranus1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }    
            
            {
                ImageIcon uranus2 = new ImageIcon("uranus2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus3 = new ImageIcon("uranus3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus4 = new ImageIcon("uranus4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus5 = new ImageIcon("uranus5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus6 = new ImageIcon("uranus6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus7 = new ImageIcon("uranus7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus8 = new ImageIcon("uranus8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus9 = new ImageIcon("uranus9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon uranus10 = new ImageIcon("uranus10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("uranus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //SATURN LINUS
            {
                ImageIcon saturn1 = new ImageIcon("saturn1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn2 = new ImageIcon("saturn2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn3 = new ImageIcon("saturn3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn4 = new ImageIcon("saturn4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn5 = new ImageIcon("saturn5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn6 = new ImageIcon("saturn6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn7 = new ImageIcon("saturn7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn8 = new ImageIcon("saturn8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn9 = new ImageIcon("saturn9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon saturn10 = new ImageIcon("saturn10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("saturn10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //jUPITER LINUS
            
            {
                ImageIcon jupiter1 = new ImageIcon("jupiter1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter2 = new ImageIcon("jupiter2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon jupiter3 = new ImageIcon("jupiter3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            {
                ImageIcon jupiter4 = new ImageIcon("jupiter4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter5 = new ImageIcon("jupiter5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter6 = new ImageIcon("jupiter6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter7 = new ImageIcon("jupiter7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter8 = new ImageIcon("jupiter8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter9 = new ImageIcon("jupiter9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon jupiter10 = new ImageIcon("jupiter10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("jupiter10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //mars linus
            
            {
                ImageIcon mars1 = new ImageIcon("mars1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars2 = new ImageIcon("mars2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars3 = new ImageIcon("mars3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars4 = new ImageIcon("mars4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars5 = new ImageIcon("mars5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars6 = new ImageIcon("mars6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars7 = new ImageIcon("mars7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars8 = new ImageIcon("mars8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars9 = new ImageIcon("mars9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mars10 = new ImageIcon("mars10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mars10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life - damage;
                    life = hp;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //EARTH LINUS
            
            {
                ImageIcon earth1 = new ImageIcon("earth1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth2 = new ImageIcon("earth2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth3 = new ImageIcon("earth3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth4 = new ImageIcon("earth4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth5 = new ImageIcon("earth5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth6 = new ImageIcon("earth6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth7 = new ImageIcon("earth7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth8 = new ImageIcon("earth8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth9 = new ImageIcon("earth9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon earth10 = new ImageIcon("earth10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("earth10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //VENUS LINUS
            
            {
                ImageIcon venus1 = new ImageIcon("venus1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus2 = new ImageIcon("venus2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus3 = new ImageIcon("venus3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus4 = new ImageIcon("venus4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus5 = new ImageIcon("venus5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus6 = new ImageIcon("venus6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus7 = new ImageIcon("venus7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus8 = new ImageIcon("venus8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus9 = new ImageIcon("venus9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon venus10 = new ImageIcon("venus10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("venus10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            //MERCURY LINUS
            
            {
                ImageIcon mercury1 = new ImageIcon("mercury1.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury1.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury2 = new ImageIcon("mercury2.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury2.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury3 = new ImageIcon("mercury3.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury3.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury4 = new ImageIcon("mercury4.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury4.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury5 = new ImageIcon("mercury5.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury5.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury6 = new ImageIcon("mercury6.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury6.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[2]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury7 = new ImageIcon("mercury7.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury7.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury8 = new ImageIcon("mercury8.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury8.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[1]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury9 = new ImageIcon("mercury9.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury9.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[0]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            {
                ImageIcon mercury10 = new ImageIcon("mercury10.gif");
                String[] choices = { "A", "B", "C", "D" };
                ImageIcon nep = new ImageIcon("mercury10.gif");
                Object input = JOptionPane.showInputDialog(null, "Choose your answer", "TEEN TITANS",
                JOptionPane.QUESTION_MESSAGE, nep, choices, choices[0]);
                if (input == choices[3]) {
                    ImageIcon result = new ImageIcon("rightans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, result);
                    int damage = 5;
                    int hp = life = life;
                    JOptionPane.showMessageDialog(null, hp);
                } else {
                    int damage = 3;
                    ImageIcon res2 = new ImageIcon("wrongans.gif");
                    JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                    int hp = life = life - damage;
                    JOptionPane.showMessageDialog(null, hp);
                }
            }
            
            if (life <= 0) {
                ImageIcon res2 = new ImageIcon("gameover.gif");
                JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
                System.exit(0);
            }
            
            ImageIcon res2 = new ImageIcon("mission.gif");
            JOptionPane.showMessageDialog(null, "", "TEEN TITANS", JOptionPane.PLAIN_MESSAGE, res2);
            System.exit(0);
            
        }
        
        
    }
}
