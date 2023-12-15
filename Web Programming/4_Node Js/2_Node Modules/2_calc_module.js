exports.isPrime = function(n){
    flag = true;
    for(let i=2; i<=n/2; i++)
    {
        if(n%i==0)
        {
            flag=false;
        }
    }
    return flag?true:false;
};


exports.isPerfect = function(n){
    let sum=0;
    for(let i=0; i<n; i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(sum==n)
    {
        return true;
    }
    return false;
};


exports.calfact = function(n){
    fact=1;
    for(let i=2; i<=n; i++)
    {
        fact=fact*i;
    }
    return fact;
};
