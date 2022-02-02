# sunbase-task


This app is named as sunbase-task. This app is made for a task or assignment of SunbaseData.
In this application images are featched from Unsplash API and a searchbar also available.
If your internet is off then it cannot load images but if your images are load previously then it stored in room database.
you can see those images. And also in no internet situation search will not work.
If you restore internet it available as before. It has two activity. One is Home and another is Search.


## Disclaimer

Images are obtained from Unsplash API.
Here Unsplash API and different libraries are used.
## License

[MIT](https://choosealicense.com/licenses/mit/)

MIT License

Copyright (c) 2018 Samuel Gracious Etsiakoh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


## Lessons Learned

What did you learn while building this project? What challenges did you face and how did you overcome them?

You can learn about tab layout and how to use ViewPager in your android app.
## Feedback

If you have any feedback, please reach out to us at santanusingha156@gmail.com


## 🔗 Links

[![linkedin](https://img.shields.io/badge/https://www.linkedin.com/in/santanu-singha-43384a198/)](https://www.linkedin.com/)



## API Reference

#### Get all items

```https://newsapi.org/
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.
