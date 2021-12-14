#1
View.OnClickListener listener = new View.OnClickListener ()
{
  @Override public void onClick (View v)
  {

    Intent i;
    i = new Intent (FirstActivity.this, SecondActivity.class);

    startActivity (i);
  }
};

#2
public void 
onActivityResult 
 (int requestCode, int resultCode, Intent data)
{
  
String login = 
data 
. 
 getStringExtra 
 ("LOGIN");
  
String password = 
data 
. 
 getStringExtra 
 ("PASSWORD");
  
Toast.makeText (MainActivity.this, login + ":" + password,
		   Toast.LENGTH_SHORT).show ();

}

#3
View.OnClickListener listener = new View.OnClickListener ()
{
  
@Override 
 public void onClick (View v)
  {
    
 
Intent 
      galleryIntent = new 
      Intent 
      (Intent.ACTION_PICK,
       android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    
 
startActivityForResult 
 (galleryIntent, 0);

} 
}
