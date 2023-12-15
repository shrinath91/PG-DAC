exports.filterPrime = function(numbers)
{
    let prime_arr = numbers.filter(function(v){
        for(i=2; i<=v/2; i++)
        {
            if(v%i==0)
            {
                return false;
            }
        }
        return true;
    })
    return prime_arr;
};

exports.longString = function(strings)
{
   let str = strings.reduce(function(s,v){
       return s.length>v.length?s:v;
   });

   return str;
}

exports.showDate = function()
{
    let cdate = new Date();
    date=cdate.getDate();

    m = cdate.getMonth();
    let month = ["jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ];
    month = month[m];

    year = cdate.getFullYear();

    hour = cdate.getHours();
    minute = cdate.getMinutes();
    seconds = cdate.getSeconds();
    return date+" "+month+" "+year+" "+hour+":"+minute+":"+seconds;

}