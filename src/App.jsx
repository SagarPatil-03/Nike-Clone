import { Routes, Route } from "react-router-dom";
import Navbar from "./Navbar";
import About from "./About";
import Mens from "./Mens";
import Womens from "./Womens";
import Kids from "./Kids";
import Mv1 from "./Mv1";
import Order from "./order";

const App = () => {
  return (
    <Routes>
      <Route path="" element={<Navbar />} />
      <Route path="/about" element={<About />} />
      <Route path="/mens" element={<Mens />} />
      <Route path="/Womens" element={<Womens />} />
      <Route path="/kids" element={<Kids/>}/>
      <Route path="/mv1" element={<Mv1/>}/>
       <Route path="/order" element={<Order/>}/>


      
      

    </Routes>
  );
};

export default App;
