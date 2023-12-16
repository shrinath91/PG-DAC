import logo from './logo.svg';
import './App.css';
import HelloClass from './components/2_React Component/Hello_class';
import Hello from './components/2_React Component/Hello_function';

import DateTime from './components/2_React Component/Date_time';
import { BulletList , Table} from './components/2_React Component/bulleted_list';
import PropsFactorial from './components/3_React Props/ReactProps1';
import PropsArrName from './components/3_React Props/ReactProps2';
import ReactPropEmp from './components/3_React Props/ReactProps3';
import PropEmp from './components/3_React Props/ReactProps3';
import { Wlcm_StateClassComp } from './components/4_Component State/1_welcome_StateclsComp';
import { Wlcm_StateFuncComp } from './components/4_Component State/1_welcome_StateFunComp';
import ParaColorChange from './components/4_Component State/2_para_color_StateFunc';
import StateFunIncDec from './components/4_Component State/3_increment_decrement';
import AddArray from './components/4_Component State/5_State_arrayList';
import ImgHideUnhide from './components/4_Component State/4_image';
import Welcome, { GreetUserForm } from './components/5_Handling forms and events\'/1_Welcome';
import RegForm from './components/5_Handling forms and events\'/2_RegForm';
import RegForm1 from './components/5_Handling forms and events\'/trail';
import { Link, Route, Routes } from 'react-router-dom';
import UsingEffectComp from './components/2_React Component/UsingEffectComp';
import HomeComp from './components/7_React Routing/HomeComp';
import EmpForm from './components/7_React Routing/EmpForm';
import WrongUrl from './components/7_React Routing/WrongUrl';
import DynamicStyle from './components/7_React Routing/DynamicStyle';
import GetRESTAPI from './components/9_Dealing with REST API/1_Assignment';
import InserEmp from './components/9_Dealing with REST API/3_Assignment';
import FormValidation from './components/5_Handling forms and events\'/FormValidation';

function App() {
  return (
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

    //     
        
    //   </header>
    // </div>
        <div>
          {/* Assignments */}
          {/* <HelloClass/> */}
          {/* <Hello/> */}

          
          {/* <HelloImg/> */}

          {/* <DateTime/> */}

          {/* <BulletList/> */}
          {/* <Table /> */}

          {/* <PropsFactorial num="5"/> */}

          {/* <PropsArrName nameArr =  {['Shrinath', 'Daulat', 'Harris', 'Tokas']}/> */}

          {/* <PropEmp emps = {[{eid:101, ename:'Hariya', sal:3000},{eid:102, ename:'Mariya', sal:20000},{eid:103, ename:'Jariya', sal:9000}]}/> */}

          {/* <Wlcm_StateClassComp/> */}

          {/* <Wlcm_StateFuncComp/> */}

          {/* <ParaColorChange/> */}

          {/* <StateFunIncDec/> */}

          {/* <ImgHideUnhide/> */}

          {/* <AddArray/> */}

          {/* <GreetUserForm/> */}

          {/* <RegForm/> */}

        {/* Components Life Cycle */}
          <ul className="nav navbar">
              <li className="nav-item">
                  <Link to="/hello" className="nav-link">Hello comp</Link>
              </li>
              <li className="nav-item">
                  <Link to="/timer" className="nav-link">Timer Comp</Link>
              </li>
              <li className="nav-item">
                  <Link to="/empform" className="nav-link">Emp Form</Link>
              </li>
              <li className="nav-item">
                  <Link to="/empdata" className="nav-link">Emp Data</Link>
              </li>
              <li className="nav-item">
                  <Link to="/getRESTAPI" className="nav-link">Get REST API</Link>
              </li>
              <li className="nav-item">
                  <Link to="/insertemp" className="nav-link">Insert Emp</Link>
              </li>
              <li className="nav-item">
                  <Link to="/formval" className="nav-link">Form Validation</Link>
              </li>
          </ul>  
          
            <Routes>
              <Route path="/" element={ <HomeComp/> } />
              <Route path="/hello" element={<HelloClass/> }  />
              <Route path="/timer" element={<UsingEffectComp/> }  />
              <Route path="/empform" element={ <EmpForm/> } />
              <Route path="/styling" element={<DynamicStyle/>}/>
              <Route path="/getRESTAPI" element={<GetRESTAPI/>}/>
              <Route path='*' element={ <WrongUrl/> } />
              <Route path='/insertemp' element={ <InserEmp/>  } />
              <Route path='/formval' element={ <FormValidation/>  } />
            </Routes>
          

          
        </div>
  );
}

export default App;
