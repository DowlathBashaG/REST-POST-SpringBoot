# VMWare-Project

Documentation for REST API ( SUM & DIFF) :  https://documenter.getpostman.com/view/5842867/SzS4STPT

## API 1- SUM

# POST : http://localhost:9091/api/add

Request :

{
  "x": 100,
  "y": 50
}


Response :

{
    "result": 150
}

## API 2- DIFF

# POST : http://localhost:9091/api/diff

{
  "x": 100,
  "y": 50
}


{
    "result": 50
}
