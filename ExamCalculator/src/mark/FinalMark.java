/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mark;

import mark.Mark;
public class FinalMark extends Mark{

    public FinalMark(int value) {
        super(value);
    }

    @Override
    public double contribution() {
        return 1.0;
    }
    
}
