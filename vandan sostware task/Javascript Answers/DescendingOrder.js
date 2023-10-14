
/*
2. Perform sorting of an array in descending order.
*/


var arr=[12,52,36,45,25];
document.write("The array before Arranging");
document.write("<br>");
document.write(arr);

 for(var i=0;i<arr.length;i++)
        {
            for(var j=0;j<arr.length;j++)
            {
                if( arr[i] >arr[j])
                {
                    var temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

document.write("<br>");
document.write("After Arranging the array in Desending Order: ");
document.write("<br>");
document.write(arr);

/*
OUTPUT :

The array before Arranging
12,52,36,45,25
After Arranging the array in Desending Order:
52,45,36,25,12
 
 */




