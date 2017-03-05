package com.munna.com.quizinggame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.HashMap;


public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Quizes.db";




    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL("create table Chemistry " + "(id integer primary key, Question text,option1 text,option2 text,option3 text,option4 text,ans int)");
        db.execSQL("create table Astronomy " + "(id integer primary key, Question text,option1 text,option2 text,option3 text,option4 text,ans int)");
        db.execSQL("create table Biology " + "(id integer primary key, Question text,option1 text,option2 text,option3 text,option4 text,ans int)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS Chemistry");
        db.execSQL("DROP TABLE IF EXISTS Biology");

        db.execSQL("DROP TABLE IF EXISTS Astronomy");
        onCreate(db);
    }

    public boolean insertValuesAstro(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Question", "What lies in between jupiter And pluto");
        contentValues.put("option1", "Sun");
        contentValues.put("option2", "Earth");
        contentValues.put("option3", "Saturn");
        contentValues.put("option4", "Venus");
        contentValues.put("ans", "3");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet is known as the \"watery planet\" or \"blue planet\" ?");
        contentValues.put("option1", "Mercury");
        contentValues.put("option2", "Pluto");
        contentValues.put("option3", "Mars");
        contentValues.put("option4", "Earth");
        contentValues.put("ans", "4");
        db.insert("Astronomy", null, contentValues);
        contentValues.put("Question", "Which planet is closest to Earth ?");
        contentValues.put("option1", "Mars");
        contentValues.put("option2", "Mercury");
        contentValues.put("option3", "Venus");
        contentValues.put("option4", "Moon");
        contentValues.put("ans", "3");
        db.insert("Astronomy", null, contentValues);
        contentValues.put("Question", "Which is the 'King of the Planets' ?");
        contentValues.put("option1", "Jupiter");
        contentValues.put("option2", "Earth");
        contentValues.put("option3", "Saturn");
        contentValues.put("option4", "Mercury");
        contentValues.put("ans", "1");
        db.insert("Astronomy", null, contentValues);
        contentValues.put("Question", "Which of the following is not an 'Inner Planet' ?");
        contentValues.put("option1", "Mercury");
        contentValues.put("option2", "Jupiter");
        contentValues.put("option3", "Venus");
        contentValues.put("option4", "Mars");
        contentValues.put("ans", "2");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Between which two planets are asteroids mainly found ?");
        contentValues.put("option1", "Jupiter and Saturn");
        contentValues.put("option2", "Earth and Mars");
        contentValues.put("option3", "Mars and Jupiter");
        contentValues.put("option4", "Saturn and Uranus");
        contentValues.put("ans", "3");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet has the highest mountain and volcano in the entire solar system?");
        contentValues.put("option1", "Mercury");
        contentValues.put("option2", "Mars");
        contentValues.put("option3", "Pluto");
        contentValues.put("option4", "Earth");
        contentValues.put("ans", "2");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet has an orbit around the Sun whose angle is steeper than that of other\n" +
                "planets ?");
        contentValues.put("option1", "Neptune");
        contentValues.put("option2", "Pluto");
        contentValues.put("option3", "Uranus");
        contentValues.put("option4", "Saturn");
        contentValues.put("ans", "4 ");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet appears greenish in color and spins clockwise ?");
        contentValues.put("option1", "Saturn");
        contentValues.put("option2", "Pluto");
        contentValues.put("option3", "Uranus");
        contentValues.put("option4", "Neptune");
        contentValues.put("ans", "4");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet has an orbit around the Sun whose angle is steeper than that of other\n" +
                "planets ?");
        contentValues.put("option1", "Pluto");
        contentValues.put("option2", "Neptune");
        contentValues.put("option3", "Uranus");
        contentValues.put("option4", "Saturn");
        contentValues.put("ans", "1");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet is most likely to support life after the Earth ?");
        contentValues.put("option1", "Jupiter");
        contentValues.put("option2", "Mars");
        contentValues.put("option3", "Venus");
        contentValues.put("option4", "Mercury");
        contentValues.put("ans", "2");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which is the only outer planet made of solid material ?");
        contentValues.put("option1", "Uranus");
        contentValues.put("option2", "Saturn");
        contentValues.put("option3", "Pluto");
        contentValues.put("option4", "Neptune");
        contentValues.put("ans", "3");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Of which planet is the Great Red Spot a striking feature ?");
        contentValues.put("option1", "Mars");
        contentValues.put("option2", "Jupiter");
        contentValues.put("option3", "Venus");
        contentValues.put("option4", "Saturn");
        contentValues.put("ans", "2");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet is known as the \"watery planet\" or \"blue planet\" ?");
        contentValues.put("option1", "Mercury");
        contentValues.put("option2", "Earth");
        contentValues.put("option3", "Pluto");
        contentValues.put("option4", "Mars");
        contentValues.put("ans", "2");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet has the highest mountain and volcano in the entire solar system?");
        contentValues.put("option1", "Mars");
        contentValues.put("option2", "Mercury");
        contentValues.put("option3", "Pluto");
        contentValues.put("option4", "Earth");
        contentValues.put("ans", "2");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which of the following is not an 'Outer Planet' ?");
        contentValues.put("option1", "Mars");
        contentValues.put("option2", "Saturn");
        contentValues.put("option3", "Uranus");
        contentValues.put("option4", "Jupiter");
        contentValues.put("ans", "1");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which planet was the destination of the Cassini-Huygens mission ?");
        contentValues.put("option1", "Saturn");
        contentValues.put("option2", "Mars");
        contentValues.put("option3", "Jupiter");
        contentValues.put("option4", "Venus");
        contentValues.put("ans", "1");
        db.insert("Astronomy", null, contentValues);

        contentValues.put("Question", "Which is the 'King of the Planets' ?");
        contentValues.put("option1", "Jupiter");
        contentValues.put("option2", "Earth");
        contentValues.put("option3", "Saturn");
        contentValues.put("option4", "Mercury");
        contentValues.put("ans", "1");
        db.insert("Astronomy", null, contentValues);




        return true;}
    public boolean insertValuesBio(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Question", "If you remove all of the functional groups from an organic molecule so that it has only carbon and hydrogen atoms, the molecule becomes a _____ molecule.");
        contentValues.put("option1", "carbohydrate");
        contentValues.put("option2", "carbonyl");
        contentValues.put("option3", "carboxyl");
        contentValues.put("option4", "hydrocarbon");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "All of the following are true of protein denaturation except that it");
        contentValues.put("option1", "is a shape change");
        contentValues.put("option2", "is always irreversible");
        contentValues.put("option3", "may be caused by a pH change");
        contentValues.put("option4", "could result from a temperature change");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "There are several levels of protein structure, the most complex of which is");
        contentValues.put("option1", "primary");
        contentValues.put("option2", "secondary");
        contentValues.put("option3", "tertiary");
        contentValues.put("option4", "quaternary");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "Nucleic acids are chains of 5-carbon sugars linked by ____ bonds with an organic base protruding from each sugar.");
        contentValues.put("option1", "amino");
        contentValues.put("option2", "phosphodiester");
        contentValues.put("option3", "carboxyl");
        contentValues.put("option4", "phosphate");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "With respect to galactose, glucose is");
        contentValues.put("option1", "a stereoisomer");
        contentValues.put("option2", "a structural isomer");
        contentValues.put("option3", "not an isomer");
        contentValues.put("option4", "unrelated except that they are both sugars");
        contentValues.put("ans", "1");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "The functional group - NH2 is a(n)");
        contentValues.put("option1", "carboxyl group");
        contentValues.put("option2", "amino group");
        contentValues.put("option3", "hydroxyl group");
        contentValues.put("option4", "phosphate group");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Which of the following is not a lipid?");
        contentValues.put("option1", "chitin");
        contentValues.put("option2", "terpene");
        contentValues.put("option3", "steroids");
        contentValues.put("option4", "prostaglandins");
        contentValues.put("ans", "1");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Glucose is a");
        contentValues.put("option1", "protein");
        contentValues.put("option2", "disaccharide");
        contentValues.put("option3", "monosaccharide");
        contentValues.put("option4", "starch");
        contentValues.put("ans", "3");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Double helix describes the structure of a molecule of");
        contentValues.put("option1", "protein");
        contentValues.put("option2", "disaccharide");
        contentValues.put("option3", "monosaccharide");
        contentValues.put("option4", "DNA");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Triacylglycerol contains fatty acids and");
        contentValues.put("option1", "glucose");
        contentValues.put("option2", "glycogen");
        contentValues.put("option3", "glycerol");
        contentValues.put("option4", "an amino group");
        contentValues.put("ans", "3");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Animals store glucose in the form of");
        contentValues.put("option1", "amylose");
        contentValues.put("option2", "glycogen");
        contentValues.put("option3", "glycerol");
        contentValues.put("option4", "guanine");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "What is the yield of chemical energy, on average, for every gram of carbohydrate and every gram of fat that is utilized?");
        contentValues.put("option1", "4 kcal each");
        contentValues.put("option2", "9 kcal each");
        contentValues.put("option3", "4 kcal and 9 kcal, respectively");
        contentValues.put("option4", "9 kcal and 4 kcal, respectively");
        contentValues.put("ans", "3");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "In the formation of a macromolecule, what type of bond would join two amino acid subunits?");
        contentValues.put("option1", "ionic bond");
        contentValues.put("option2", "phosphodiester bond");
        contentValues.put("option3", "hydrogen bond");
        contentValues.put("option4", "peptide bond");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "In the formation of a macromolecule, what type of reaction would join two subunits together?");
        contentValues.put("option1", "hydrophobic reaction");
        contentValues.put("option2", "hydrolysis reaction");
        contentValues.put("option3", "dehydration reaction");
        contentValues.put("option4", "denaturation reaction");
        contentValues.put("ans", "3");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "The sequence of amino acids in a polypeptide is called the");
        contentValues.put("option1", "primary structure");
        contentValues.put("option2", "secondary structure");
        contentValues.put("option3", "tertiary structure");
        contentValues.put("option4", "quaternary structure");
        contentValues.put("ans", "1");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "The globular shape of a protein is called the");
        contentValues.put("option1", "primary structure");
        contentValues.put("option2", "secondary structure");
        contentValues.put("option3", "tertiary structure");
        contentValues.put("option4", "quaternary structure");
        contentValues.put("ans", "3");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "In a DNA molecule, what holds together nitrogenous bases from the two polymer chains?");
        contentValues.put("option1", "phosphodiester bonds");
        contentValues.put("option2", "ionic bond");
        contentValues.put("option3", "covalent bonds");
        contentValues.put("option4", "hydrogen bonds");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Assuming they all had the same number of carbon atoms, which of the following has the most C-H bonds?");
        contentValues.put("option1", "an unsaturated fat");
        contentValues.put("option2", "a polyunsaturated fat");
        contentValues.put("option3", "a polysaccharide");
        contentValues.put("option4", "a saturated fat");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);


        contentValues.put("Question", "Why is cellulose so difficult for most animals to digest?");
        contentValues.put("option1", "they don't have the proper enzyme to break the bonds between subunits");
        contentValues.put("option2", "cellulose is made up of chitin, which is indigestible");
        contentValues.put("option3", "the bonds holding cellulose subunits together are extremely strong, stronger than in any other macromolecule");
        contentValues.put("option4", "there are many hydrogen bonds holding the subunits together");
        contentValues.put("ans", "1");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "What happens during a hydrolysis reaction");
        contentValues.put("option1", "protein coils into its secondary structure");
        contentValues.put("option2", "the bond between two subunits of a macromolecule is broken");
        contentValues.put("option3", "saturated fats become unsaturated");
        contentValues.put("option4", "a bond is formed between two subunits of a macromolecule");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "Which of the following is not a disaccharide?");
        contentValues.put("option1", "sucrose");
        contentValues.put("option2", "maltose");
        contentValues.put("option3", "lactose");
        contentValues.put("option4", "all of the above ");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "The general term for a large molecule made up of many similar subunits is");
        contentValues.put("option1", "polymer");
        contentValues.put("option2", "functional group");
        contentValues.put("option3", "peptide");
        contentValues.put("option4", "helix");
        contentValues.put("ans", "1");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "Dehydration and hydrolysis reactions involve removing or adding _______________ to macromolecule subunits.");
        contentValues.put("option1", "C and O");
        contentValues.put("option2", "CH and NH2");
        contentValues.put("option3", "C and H");
        contentValues.put("option4", "OH and H");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "The empirical formula for carbohydrates is");
        contentValues.put("option1", "(CHO)2");
        contentValues.put("option2", "(CH20)n");
        contentValues.put("option3", "2(CHO)n");
        contentValues.put("option4", "(CnHnOn)2");
        contentValues.put("ans", "2");
        db.insert("Biology", null, contentValues);

        contentValues.put("Question", "Which of the following nitrogenous bases is found in DNA but is not found in RNA");
        contentValues.put("option1", "adenine");
        contentValues.put("option2", "guanine");
        contentValues.put("option3", "cytosine");
        contentValues.put("option4", "thymine");
        contentValues.put("ans", "4");
        db.insert("Biology", null, contentValues);






        return true;
      }
    public boolean insertValuesChemistry() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //q1
        contentValues.put("Question", "The nucleus of an atom consists of ");
        contentValues.put("option1", "electrons and neutrons");
        contentValues.put("option2", "electrons and protons");
        contentValues.put("option3", "protons and neutrons");
        contentValues.put("option4", "All of the above");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The number of moles of solute present in 1 kg of a solvent is called its ");
        contentValues.put("option1", "molality");
        contentValues.put("option2", "molarity");
        contentValues.put("option3", "normality");
        contentValues.put("option4", "formality");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The most electronegative element among the following is");
        contentValues.put("option1", "sodium");
        contentValues.put("option2", "bromine");
        contentValues.put("option3", "fluorine");
        contentValues.put("option4", "oxygen");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);
//q4
        contentValues.put("Question", "The metal used to recover copper from a solution of copper sulphate is");
        contentValues.put("option1", "Na");
        contentValues.put("option2", "Ag");
        contentValues.put("option3", "Hg");
        contentValues.put("option4", "Fe");
        contentValues.put("ans", "4");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The number of d-electrons in Fe2+ (Z = 26) is not equal to that of");
        contentValues.put("option1", "p-electrons in Ne(Z = 10)");
        contentValues.put("option2", "s-electrons in Mg(Z = 12)");
        contentValues.put("option3", "d-electrons in Fe(Z = 26)");
        contentValues.put("option4", "p-electrons in CI(Z = 17)");
        contentValues.put("ans", "4");
        db.insert("Chemistry", null, contentValues);


        contentValues.put("Question", "The metallurgical process in which a metal is obtained in a fused state is called");
        contentValues.put("option1", "smelting");
        contentValues.put("option2", "roasting");
        contentValues.put("option3", "calcinations");
        contentValues.put("option4", "froth floatation");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);


        contentValues.put("Question",  "The molecules of which gas have highest speed?");
        contentValues.put("option1", "H2 at -73oC");
        contentValues.put("option2", "CH4 at 300 K");
        contentValues.put("option3", "N2 at 1,027oC");
        contentValues.put("option4", "O2 at 0oC");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The law which states that the amount of gas dissolved in a liquid is proportional to its partial pressure is");
        contentValues.put("option1", "Dalton's law");
        contentValues.put("option2", "Gay Lussac's law");
        contentValues.put("option3", "Henry's law");
        contentValues.put("option4", "Raoult's law");
        contentValues.put("ans", "3");

        contentValues.put("Question", "The main buffer system of the human blood is");
        contentValues.put("option1", "H2CO3 - HCO3");
        contentValues.put("option2", "H2CO3 - CO3 2-");
        contentValues.put("option3", "CH3COOH - CH3COO-");
        contentValues.put("option4", "NH2CONH2 - NH2CONH+");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The gas present in the stratosphere which filters out some of the sun's ultraviolet light and provides an effective shield against radiation damage to living things is");
        contentValues.put("option1", "helium");
        contentValues.put("option2", "ozone");
        contentValues.put("option3", "oxygen");
        contentValues.put("option4", "methane");
        contentValues.put("ans", "2");
        db.insert("Chemistry", null, contentValues);
        contentValues.put("Question", "The most commonly used bleaching agent is");
        contentValues.put("option1", "alcohol");
        contentValues.put("option2", "carbon dioxide");
        contentValues.put("option3", "chlorine");
        contentValues.put("option4", "sodium chlorine");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The heat required to raise the temperature of body by 1 K is called");
        contentValues.put("option1", "specific heat");
        contentValues.put("option2", "thermal capacity");
        contentValues.put("option3", "water equivalent");
        contentValues.put("option4", "None of the above");
        contentValues.put("ans", "");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The nucleus of a hydrogen atom consists of");
        contentValues.put("option1", "1 proton only");
        contentValues.put("option2", "1 proton + 2 neutron");
        contentValues.put("option3", "1 neutron only");
        contentValues.put("option4", "1 electron only");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);


        contentValues.put("Question",  "The nuclear particles which are assumed to hold the nucleons together are");
        contentValues.put("option1", "electrons");
        contentValues.put("option2", "positrons");
        contentValues.put("option3", "neutrons");
        contentValues.put("option4", "mesons");
        contentValues.put("ans", "4");
        db.insert("Chemistry", null, contentValues);


        contentValues.put("Question", "The mass of P4O10 that will be obtained from the reaction of 1.33 gram of P4 and 5.07 of oxygen is");
        contentValues.put("option1", "2.05 gram");
        contentValues.put("option2", "3.05 gram");
        contentValues.put("option3", "4.05 gram");
        contentValues.put("option4", "5.05 gram");
        contentValues.put("ans", "2");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The octane number of zero is assigned to");
        contentValues.put("option1", "2-methyl octane");
        contentValues.put("option2", "n-heptane");
        contentValues.put("option3", "iso-octane");
        contentValues.put("option4", "3-methyl octane");
        contentValues.put("ans", "2");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The metal that is used as a catalyst in the hydrogenation of oils is");
        contentValues.put("option1", "Ni");
        contentValues.put("option2", "Pb");
        contentValues.put("option3", "Cu");
        contentValues.put("option4", "Pt");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);


        contentValues.put("Question", "The most abundant rare gas in the atmosphere is");
        contentValues.put("option1", "He");
        contentValues.put("option2", "Ne");
        contentValues.put("option3", "Ar");
        contentValues.put("option4", "Xe");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The Latin word formica means ant. The name formic acid is derived from this Latin word because");
        contentValues.put("option1", "this acid, in ancient times, was used to eliminate ant-hills");
        contentValues.put("option2", "this corrosive acid is secreted by ants to drive away their enemies");
        contentValues.put("option3", "this acid was first obtained by the distillation of ants");
        contentValues.put("option4", "ants are attracted by the odour of this acid");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);


        contentValues.put("Question", "The ore which is found in abundance in India is");
        contentValues.put("option1", "monazite");
        contentValues.put("option2", "fluorspar");
        contentValues.put("option3", "bauxite");
        contentValues.put("option4", "magnetite");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question","The inherited traits of an organism are controlled by");
        contentValues.put("option1", "RNA molecules");
        contentValues.put("option2", "nucleotides");
        contentValues.put("option3", "DNA molecules");
        contentValues.put("option4", "enzymes");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The heat energy produced when the human body metabolises 1 gram of fat is");
        contentValues.put("option1", "30 KJ");
        contentValues.put("option2", "1 KJ");
        contentValues.put("option3", "39 KJ");
        contentValues.put("option4", "29 KJ");
        contentValues.put("ans", "3");
        db.insert("Chemistry", null, contentValues);
        contentValues.put("Question", "What are the number of moles of CO2 which contains 16 g of oxygen?");
        contentValues.put("option1", "0.5 mole");
        contentValues.put("option2", "0.2 mole");
        contentValues.put("option3", "0.4 mole");
        contentValues.put("option4", "0.25 mole");
        contentValues.put("ans", "1");
        db.insert("Chemistry", null, contentValues);
        contentValues.put("Question", "The main use of salt in the diet is to");
        contentValues.put("option1", "make the taste of food better");
        contentValues.put("option2", "produce in small amounts the hydrochloric acid required for the digestion of food");
        contentValues.put("option3", "ease the process of cooking");
        contentValues.put("option4", "increase the solubility of food particles in water");
        contentValues.put("ans", "2");
        db.insert("Chemistry", null, contentValues);

        contentValues.put("Question", "The monomer of polythene is");
        contentValues.put("option1", "vinyl chloride");
        contentValues.put("option2", "ethylene");
        contentValues.put("option3", "ethyl alcohol");
        contentValues.put("option4", "None of the above");
        contentValues.put("ans", "");
        db.insert("Chemistry", null, contentValues);
        contentValues.put("Question", "The luster of a metal is due to");
        contentValues.put("option1", "Its high density");
        contentValues.put("option2", "its high polishing");
        contentValues.put("option3", "its chemical inertness");
        contentValues.put("option4", "presence of free electrons");
        contentValues.put("ans", "4");
        db.insert("Chemistry", null, contentValues);
        contentValues.put("Question",  "The number of water molecules present in a drop of water (volume 0.0018 ml) at room temperature is");
        contentValues.put("option1", "1.568 x 10 3");
        contentValues.put("option2", "6.023 x 10 19");
        contentValues.put("option3", "4.84 x 10 17");
        contentValues.put("option4", "6.023 x 10 23");
        contentValues.put("ans", "2");
        db.insert("Chemistry", null, contentValues);

        return true;
    }

    public Cursor getDataChem(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Chemistry where id=" + id + "", null);
        res.moveToFirst();
        return res;
    }

    public Cursor getDataAstro(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor resAstro;
        resAstro = db.rawQuery("select * from Astronomy where id=" + id + "", null);
        resAstro.moveToFirst();
        return resAstro;
    }
    public Cursor getDataBio(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Biology where id=" + id + "", null);
        res.moveToFirst();
        return res;
    }


}

