import React from 'react'
import shoes from"./assets/Wshoes.jpg"
import slipper from "./assets/wslip.jpg"
import  wtshirt from "./assets/Wtshir.jpg"
import w from "./assets/wwood.jpg"

const Womens = () => {
  return (
    <div>
<marquee> Welcome Womens Collection</marquee>
<p>Women's  Shoes</p>
<img src={shoes} alt="Women Shoe's" />
 <button>Visit Us</button>


 <p>Women's  Slippers</p>
<img src={slipper} alt="Women Shoe's" />
 <button>Visit Us</button>


 <p>Women's  T-shirts </p>
<img src={wtshirt} alt="Women Shoe's" />
 <button>Visit Us</button>

 <p>Women's  Hoodies</p>
<img src={w} alt="Women Shoe's" />
 <button>Visit Us</button>

    </div>
  )
}

export default Womens;
