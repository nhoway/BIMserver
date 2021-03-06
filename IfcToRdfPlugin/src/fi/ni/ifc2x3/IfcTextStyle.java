package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.IfcCharacterStyleSelect;
import fi.ni.ifc2x3.interfaces.IfcPresentationStyleSelect;
import fi.ni.ifc2x3.interfaces.IfcTextFontSelect;
import fi.ni.ifc2x3.interfaces.IfcTextStyleSelect;

/*
 * IFC Java class
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcTextStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
 // The property attributes
IfcCharacterStyleSelect textCharacterAppearance;
IfcTextStyleSelect textStyle;
IfcTextFontSelect textFontStyle;


 // Getters and setters of properties

 public IfcCharacterStyleSelect getTextCharacterAppearance() {
   return textCharacterAppearance;
 }
 public void setTextCharacterAppearance(IfcCharacterStyleSelect value){
   this.textCharacterAppearance=value;

 }

 public IfcTextStyleSelect getTextStyle() {
   return textStyle;
 }
 public void setTextStyle(IfcTextStyleSelect value){
   this.textStyle=value;

 }

 public IfcTextFontSelect getTextFontStyle() {
   return textFontStyle;
 }
 public void setTextFontStyle(IfcTextFontSelect value){
   this.textFontStyle=value;

 }

}
