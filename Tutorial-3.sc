//Q1)
def area(r:Int):Double=
{
  var A=math.Pi*r*r
  return A
}

var Area=area(5)
println("Area of disk = "+Area)

//__________________________________

//Q2)

def converter(c:Int):Double=
{
  var fahrenheit=c*1.800+32.00
  return fahrenheit
}

var temperature=converter(35)
println("35C temperature  = "+temperature+"F" )

//__________________________________

//Q3)

def volume(r:Int):Double=
{
  var v=4.0/3.0*math.Pi*r*r*r
  return v
}

var vol=volume(5)
println("Volume of sphere = "+vol)

//__________________________________

//Q4)

def totalcost(C:Int)=
  {
    var cost=0.00
    if(C<=50)
      {
        cost=(C*24.95*(60/100))+(3*C)
      }
    else
      {
        cost=C*24.95*60/100+(3*50)+(0.75*(C-50))
      }
    cost
  }
var tCost=totalcost(60)
println("Total cost Rs:"+tCost)

//__________________________________

//Q5)

def time():Double=
{
  8*2+3*7+2*8
}

println("Total running time = "+time())


