AvengersLib

AvengersLib is a library that can be used to join The Avengers.



https://user-images.githubusercontent.com/9136205/119503522-0e8f7400-bd39-11eb-806f-ad4c34e934b5.mov




Download:
-------------------------
1. Clone the repository in the root of your project/application.
2. Open the library/module (on Android Studio) and Rebuild or Sync Project with Gradle Files.


How to use it:
-------------------------
1. Open project's settings.gradle file and include the library as follows:

    include ':AvengersLib'
    project(':AvengersLib').projectDir = new File('../AvengersLib/App/')

2. Open app's build.gradle file and add the following line into dependencies section:

    api project(path: ':AvengersLib')

3. Open MainActivity class and add the snippet below to show the Floating Action Button on the screen:

    /* first we get the FAB from the avenger_float_button layout */
    
    val child =  View.inflate(this, com.citerio.avengerslib.R.layout.avenger_float_button, null) as ConstraintLayout
    

    /* and then we add it to the root view of our MainActivity layout */
    
    root.addView(child)

    /* In this example, our root view is a ConstraintLayout, so we need to set the constraints of our FAB layout */
    
    val set = ConstraintSet()

    set.clone(root)

    set.connect(child.id, ConstraintSet.BOTTOM, root.id, ConstraintSet.BOTTOM)

    set.connect(child.id, ConstraintSet.TOP, root.id, ConstraintSet.TOP)

    set.connect(child.id, ConstraintSet.END, root.id, ConstraintSet.END)

    //set.connect(child.id, ConstraintSet.START, root.id, ConstraintSet.START)
    
    set.applyTo(root)


    /* Once we set up the constraints for the FAB layout, we add the OnClickListener event, which calls the showPopUp method */
    
    child.findViewById<FloatingActionButton>(com.citerio.avengerslib.R.id.open_popup_button).setOnClickListener {
          com.citerio.avengerslib.Notifications.showPopUp(this@MainActivity)
    }


Notes:
-------------------------
1. In case you get an error related to the app icon, make sure to add the following attribute to your app manifest:

    tools:replace="android:icon"

2. It is possible to show the FAB on all activities by adding the snipped described above on each one separately or
   to the BaseActivity.



Thanks for downloading.


