# 11/8-10-Notes

## 11/8
### Gui's
* `Graphics`: is an abstract class for drawing
* `Device-independence`: graphics intervace
* `paintComponent`: methodwhich you draw graphics inside
* (0,0) is located in the top left
* `drawString`: Draws string
* `font`: can select the font



## 11/10
* Package:
* Top level first (Subdomains in reverse, then name of Package)
* Protected is shared when class is shared
* No modifier (public, protected, private) on method gives it package level access
* Basic elements
- Components = widgets
- Buttons
- Checkboxes
* Layout Managers - determin how the components are organized on th edisplay
* Java.awt (Abstract Windowing Toolkit)
* javax.swing (Swing) components start with J ie. JButton
* Container inherits from component
```java
JFrame frame = new JFrame(“Title”);
// Default is to do nothing, so this is necessary
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Default is upper left corner of screen
frame.setLocationRelativeTo(null); // centers window
// Default is size zero so only decorations will be shown
frame.setSize(100, 100);
// Won’t see anything if you forget this
frame.setVisible(true);
JButton ok = JButton("OK");//COnstructs new button
frame.add(ok); //Put it in the frame’s content pane
ok.setToolTipText(“Explanation”); //Add a tooltip (componentName.setToolTipText(“Explanation”)
```
