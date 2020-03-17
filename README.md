# VMWare-Project

Documentation for REST API ( SUM & DIFF) :  https://documenter.getpostman.com/view/5842867/SzS4STPT

### API 1- SUM

- POST : http://localhost:9091/api/add

Request :

    {

      "x": 100,

      "y": 50

    }


Response :

    {

        "result": 150

    }

### API 2- DIFF

- POST : http://localhost:9091/api/diff

Request :

    {

      "x": 100,

      "y": 50

    }

Response :

    {

        "result": 50

    }
    

### Basci Authentication Mechanism

- Welcome Page : http://localhost:9091/

![Wecome](https://user-images.githubusercontent.com/62286636/76852808-25535480-6872-11ea-8510-ed0683698540.PNG)

- User Page : http://localhost:9091/user

    - User Name  :  vmware
    
    - Password    :  vmware
    
![User_vmware_Password_vmware](https://user-images.githubusercontent.com/62286636/76853052-9d217f00-6872-11ea-958d-5cddab07ed8b.PNG)

- Admin Page : http://localhost:9091/admin




