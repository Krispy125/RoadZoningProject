<h1>Traffic Simulation & Route Planning System (Java)</h1>
<h2>Overview</h2>

This is a Java-based traffic simulation and route planning system that models a simplified road network composed of intersections and roads, computes routes between locations, and simulates traffic flow across the network.


<b>Features</b>
<hr></hr>

<ul>
<li>Road network modeling using intersections and roads</li>

<li>Road classification via enum-based road types</li>

<li>Route planning between intersections with cycle prevention</li>

<li>Traffic simulation over planned routes</li>

<li>Modular, extensible class design</li>
</ul>
<b>How It Works</b>
<hr></hr>
  <ol type="1">Build the Road Network
    <ul>
    <li>Create Intersections</li>
    <li>Connect using roads with defined types</li>
    </ul>
 Plan a Route
    <ul>
      <li>Use the RoutePlanner to find a path between two intersections</li>
    </ul>
Simulate Traffic
    <ul>
      <li>Pass the route into the TrafficSimulator</li>
      <li>Observe simulated vehicle movement across roads</li>
    </ul>
  </ol>
