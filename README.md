# Java-EE-Project

The project is tested on Glassfish 4.1 with Java EE 7.0. Web page development was completed using the JSF, the code makes use of Enterprise Java Beans and backing beans. 

To add to this I implemented data validation, so when data is entered into the database the data added or searched is checked to be valid first. If not an error message will occur stating  a valid "...." is required.
The validation was implemented into 
- FindClientByNameBean + addemployee.xhtml
- FindEmployeeByIdBean + findemployeenyid.xhtml
- AddEmployeeBean     +  addemployee.xhtml

applying the following constraints - @NotNull, @Size into the backing bean classes
applying the following tag into the xhtml files <f:validateBean …/>
