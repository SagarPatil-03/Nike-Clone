import "./Navbar.scss";
import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <div className="home">
      
      <Link to="/mens">MENS</Link>
      <Link to="/womens">WOMENS</Link>
      <Link to="/kids">KIDS</Link>
      <Link to="/about">ABOUT</Link>

      <h1>Run on Confidence. . .</h1>

      <p>
        Designed for those who never stop chasing their dreams, our collection
        delivers the perfect balance of comfort, performance, and modern style.
      </p>
    </div>
  );
};

export default Navbar;
