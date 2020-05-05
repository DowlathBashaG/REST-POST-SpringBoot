# Project

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
    
- POST MAN : 

![addition](https://user-images.githubusercontent.com/62286636/76855306-da880b80-6876-11ea-858c-fbc8c05d013f.PNG)


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
    
- POST MAN : 

![diff](https://user-images.githubusercontent.com/62286636/76855399-0e633100-6877-11ea-9bd6-68ffa761d170.PNG)

### Basci Authentication Mechanism

- Welcome page : http://localhost:9091/

![Wecome](https://user-images.githubusercontent.com/62286636/76852808-25535480-6872-11ea-8510-ed0683698540.PNG)

- User page : http://localhost:9091/user

    - User Name  :  vmware
    
    - Password    :  vmware
    
![User_vmware_Password_vmware](https://user-images.githubusercontent.com/62286636/76853052-9d217f00-6872-11ea-958d-5cddab07ed8b.PNG)

- Admin page : http://localhost:9091/admin

  - User Name  :  vmwareadmin
    
   - Password    :  vmwareadmin

![login_vmwareadmin-vmwareadmin](https://user-images.githubusercontent.com/62286636/76853601-a232fe00-6873-11ea-8c88-65c59b69e013.PNG)

- Logout page : http://localhost:9091/logout

![User_Logout](https://user-images.githubusercontent.com/62286636/76855190-9eed4180-6876-11ea-998a-db16cbac059e.PNG)
