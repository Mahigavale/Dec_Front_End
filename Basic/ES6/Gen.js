
PrintRe();

function *PrintRe()
{
    for(v=1;v<=5;v++)
    {
  yield v;
    }
}

  const gen=PrintRe();//Generator Object.

  console.log(gen.next());
  console.log(gen.next());
  console.log(gen.next());

  console.log(gen.next());
  console.log(gen.next());
  console.log(gen.next());
  
  
  
  