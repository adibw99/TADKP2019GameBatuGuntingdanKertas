package game.jankenpo;
public class NewClass {
public String nama;
public String NIM;

public NewClass(String nama ){
    this.nama = nama;
}
public String nama (){
    return ""+nama;
}

public void setNIM(String NIM)
{
    this.NIM = NIM;
}
public String getNIM()
{
    int nomer = Integer.parseInt(this.NIM);
    return ""+nomer;
}

public void exit()
    {
        System.exit(0);
    }
}


      
            
            