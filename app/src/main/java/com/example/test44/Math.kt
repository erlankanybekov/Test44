package com.example.test44

class Math {

    fun add(a:String,b:String):String{
        var result=""
        if (a.contains(".")||b.contains(".")){
            result = " у вас лишняя точка"
        }else if(a.contains("f")||b.contains("f")){
            val num1=a.toFloat()
            val num2=b.toFloat()
            result = (num1+num2).toString()

        }else if (a.equals("")||b.equals("")){
            result ="Вы не дописали"
        }
        else if (a.contains("-")||b.contains("-")){
          result=  addToInt(a,b)
        }
        else if(!isNumeric(a)||!isNumeric(b)){
            result = "Вы ввели символы"
        }
        else{
            result = addToInt(a, b)
        }
        return result
    }

    private fun addToInt(a: String, b: String): String {
        var result = ""
        val num1 = a.toInt()
        val num2 = b.toInt()
        result = (num1 + num2).toString()
        return result
    }
    private fun divideToInt(a: String, b: String): String {
        var result = ""
        val num1 = a.toInt()
        val num2 = b.toInt()
        result = (num1 / num2).toString()
        return result
    }

    fun divide(a:String,b:String):String{
        var result=""
        if(b.equals("0")){
            result ="на ноль делить нельзя"
        }else{
            result = divideToInt(a, b)
        }
        return result
    }

    fun isNumeric(string: String) = string.all { it in '0'..'9' }

}