// import logo from './logo.svg';
import { Link, Route, Routes, useNavigate } from 'react-router-dom';
import './App.css';
// import Timer1 from './Components/_06ComponentLifeCycle/_03Pratice';
// import ColorChange from './Components/_06ComponentLifeCycle/_02ColorChange';
// import Registration from './Components/_05FormAndEventHandling/_02Registration';
import Greeting from './Components/_06ComponentLifeCycle/_01getDerivedStateFromProps';
import Time from './Components/_06ComponentLifeCycle/_03Time';
import FactorialProp from './Components/_03ReactProps/_01Factorail';
import Home from './Components/_07ReactRoutiong/_01HomePage';
// import ListName from './Components/_03ReactProps/_02NameList';
// import DisEmp from './Components/_03ReactProps/_03Emp';
// import HelloMessage from './Components/_04ComponentState/HelloStateUsingClassCom';
// import ChangeColor from './Components/_04ComponentState/_02ParaColorUsingFunCom';
import IncreDecre from './Components/_04ComponentState/_03IncrementNumber';
import Wrong from './Components/_07ReactRoutiong/_01WrongURL';
import GetRESTAPI from './Components/_08RESTAPI/_01Assignment';
import GetEmpDetails from './Components/_08RESTAPI/_02ClientSide';
import LocalStoragePractise from './Components/_07ReactRoutiong/_02localStorage';
import GetLocalData from './Components/_07ReactRoutiong/_02localStorageRetrival';
// import ImageToggle from './Components/_04ComponentState/_04ImageToggel';
// import AdvNameList from './Components/_04ComponentState/_05ListName';
// import Login from './Components/_05FormAndEventHandling/_01UserIdPass';
// import PrintTable from './Components/_02ReactComponenets/_06TableOfSix';
// import NameList from './Components/_02ReactComponenets/_05NameList';
// import HelloClass from './Components/_01ClassComponent';
// import FunHello from './Components/_02FunctionComponent';
// import Image from './Components/_02ReactComponenets/_03Image.js';
// import Date1 from './Components/_02ReactComponenets/_04DateTime';

function App() {
  // let Names1 = ['Shubham','Shesherao','Kale','Saurabh'];
  // let emps = [{Ename:"Suraj",EId: 96,ESal: 20111},{Ename:"Shubham",EId: 92,ESal: 11111},{Ename:"Saurabh",EId: 22,ESal: 10111}]
  // let emp1 = {
  //   Ename : "Alone",
  //   EId : 11,
  //   ESal : 1111
  // }
  let navigator = useNavigate();
  return (
    // {/*
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>
    // <HelloClass />
    // <FunHello/>
    // <Image/>
    // <Date1/>
    // <NameList/>
    // <PrintTable/>
    // */}
    <div>
      {/* <FactorialProp number={5}/>
      <ListName Names={Names1}/>
      <DisEmp Emps={emps} e1={emp1}/>
      <HelloMessage/>
      <ChangeColor/>
      <IncreDecre/>
      <ImageToggle/>
      <AdvNameList/> 
      <Login/>
      
      <Greeting/>
      <Time/>
      <ColorChange/>
      <Timer1/>
      <Registration/>*/}
      <div className='navbar'>
        <Link to={"/"} className='navbar-item'>Home</Link>
        <Link to={"/Time"} className='navbar-item'>Time</Link>
        <Link to={"/Greeting"} className='navbar-item'>Greeting</Link>
        <Link to={"/Facto"} className='navbar-item'>Factorail</Link>
        <Link to={"/GetInfoPostman"} className='navbar-item'>PostManInfo</Link>
        <Link to={"/getEmpInfo"} className='navbar-item'>Get Emp</Link>
      </div>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/Time' element={<Time/>}/>
        <Route path='/Greeting' element={<Greeting/>}/>
        <Route path='/Facto' element={<FactorialProp number = {5}/>}/>
        <Route path='/I' element={<IncreDecre/>}/>
        <Route path='/GetInfoPostman' element={<GetRESTAPI/>}/>
        <Route path='/getEmpInfo' element={<GetEmpDetails/>}/>
        <Route path='/localStorage' element={<LocalStoragePractise/>}/>
        <Route path='*' element={<Wrong/>}/>
      </Routes>

      <button onClick={()=>{navigator("/I")}}>Get Imp Infomation</button>
      <button onClick={()=>{navigator("/localStorage")}}>Local Name</button>
      <GetLocalData/>
    </div> 
  );
}

export default App;
