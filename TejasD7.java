/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas
 */
public class TejasD7 {
    public static void main(String[] args)
    {
        
    
    // Shape shape1 = new Shape();
    
    Triangle t1 = new Triangle(20,30) {
        @Override
        void animate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    t1.x = 40;
    t1.draw();
    t1.display();
    }
}
