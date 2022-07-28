package com.company.myapplication

import android.content.Context
import java.io.*

class FileHandler {
    private val FILENAME : String = "Location.txt"
    fun writeFile(element:ArrayList<String>, context: Context):Unit{
        try {
            val fileOutputStream:FileOutputStream = context.openFileOutput(FILENAME, Context.MODE_PRIVATE);
            val oos:ObjectOutputStream = ObjectOutputStream(fileOutputStream);
            oos.writeObject(element);
            oos.close()
        }catch (e:FileNotFoundException){
            e.printStackTrace()
        }catch (e:IOException){
            e.printStackTrace()
        }
    }
    fun readFile(context: Context): ArrayList<String>? {
        var elements:ArrayList<String>?= null
        try{
            val fileInputStream:FileInputStream= context.openFileInput(FILENAME)
            val ois:ObjectInputStream = ObjectInputStream(fileInputStream)
            elements = ois.readObject() as ArrayList<String>
        }catch (e:FileNotFoundException){
            e.printStackTrace()
        }catch (e:IOException){
            e.printStackTrace()
        }
        return elements


    }
}